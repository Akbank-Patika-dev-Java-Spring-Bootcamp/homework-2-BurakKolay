package com.burakkolay.akbankhw2.controller;

import com.burakkolay.akbankhw2.controller.contract.CommentControllerContract;
import com.burakkolay.akbankhw2.dto.comment.CommentDTO;
import com.burakkolay.akbankhw2.dto.comment.CommentSaveRequest;
import com.burakkolay.akbankhw2.general.BusinessException;
import com.burakkolay.akbankhw2.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentControllerContract commentControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<CommentDTO>> save(@RequestBody CommentSaveRequest request){
        CommentDTO comment = commentControllerContract.save(request);
        return ResponseEntity.ok(RestResponse.of(comment));
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<CommentDTO>>> findAll(){
        List<CommentDTO> comments = commentControllerContract.findAll();
        return ResponseEntity.ok(RestResponse.of(comments));
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<RestResponse<List<CommentDTO>>> findAllByProductId(@PathVariable Long id){
        List<CommentDTO> comments = commentControllerContract.findAllByProductId(id);
        if (comments.size()>0)  //? Size'ına bakıyoruz. Eğer ki size'ı 0'dan büyükse yorum yapılmıştır.
            return ResponseEntity.ok(RestResponse.of(comments));
        return ResponseEntity.ok(RestResponse.errorMesage(id+" ürününe henüz yorum yapılmamıştır"));
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<RestResponse<List<CommentDTO>>> findAll(@PathVariable Long id){
        List<CommentDTO> comments = commentControllerContract.findAllByCustomerId(id);
        if (comments.size()>0)
            return ResponseEntity.ok(RestResponse.of(comments));
        return ResponseEntity.ok(RestResponse.errorMesage(id+" kullanıcısı henüz yorum yapmamıştır"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Object>> delete(@PathVariable Long id){
        commentControllerContract.delete(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
}
