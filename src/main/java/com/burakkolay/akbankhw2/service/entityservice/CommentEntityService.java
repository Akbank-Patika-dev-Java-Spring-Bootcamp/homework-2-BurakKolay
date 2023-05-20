package com.burakkolay.akbankhw2.service.entityservice;

import com.burakkolay.akbankhw2.dao.CommentRepository;
import com.burakkolay.akbankhw2.entity.Comment;
import com.burakkolay.akbankhw2.general.BaseEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityService extends BaseEntityService<Comment, CommentRepository> {

    public CommentEntityService(CommentRepository repository) {
        super(repository);
    }
    public List<Comment> findAllByProductId(Long id){
        return getRepository().findAllByProductId(id);
    }
    public List<Comment> findAllByCustomerId(Long id){
        return getRepository().findAllByCustomerId(id);
    }
}

