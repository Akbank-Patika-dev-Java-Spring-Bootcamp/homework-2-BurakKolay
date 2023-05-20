package com.burakkolay.akbankhw2.mapper;

import com.burakkolay.akbankhw2.dto.comment.CommentDTO;
import com.burakkolay.akbankhw2.dto.comment.CommentDTO2;
import com.burakkolay.akbankhw2.dto.comment.CommentSaveRequest;
import com.burakkolay.akbankhw2.dto.customer.CustomerUpdateRequest;
import com.burakkolay.akbankhw2.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    Comment convertToComment(CommentSaveRequest request);
    Comment convertToComment(CustomerUpdateRequest request);
    CommentDTO convertToCommentDTO(Comment comment);
    List<CommentDTO> converToCommentDTOList(List<Comment> commentList);

    CommentDTO2 converToCommentDTO2(Comment comment);
}
