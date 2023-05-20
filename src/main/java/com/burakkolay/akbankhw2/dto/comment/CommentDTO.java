package com.burakkolay.akbankhw2.dto.comment;

public record CommentDTO(Long id,
                         Long customerId,
                         Long productId,
                         String comment,
                         String title
                         ) {
}

