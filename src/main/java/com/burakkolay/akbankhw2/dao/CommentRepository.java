package com.burakkolay.akbankhw2.dao;

import com.burakkolay.akbankhw2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findAllByProductId(Long id);
    List<Comment> findAllByCustomerId(Long id);
}
