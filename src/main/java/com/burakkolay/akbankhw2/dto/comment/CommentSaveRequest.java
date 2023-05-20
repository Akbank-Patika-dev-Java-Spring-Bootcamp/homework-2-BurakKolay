package com.burakkolay.akbankhw2.dto.comment;

public record CommentSaveRequest(Long customerId,
                                 Long productId,
                                 String comment,
                                 String title) {

}
