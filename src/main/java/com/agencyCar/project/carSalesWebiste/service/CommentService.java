package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.model.Comment;

public interface CommentService {

    Comment createComment(Comment comment);

    Comment deleteComment(Long commentId);

    Comment updateComment(Long commentId, String text);
}
