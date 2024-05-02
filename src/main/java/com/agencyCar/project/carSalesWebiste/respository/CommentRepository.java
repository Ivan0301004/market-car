package com.agencyCar.project.carSalesWebiste.respository;

import com.agencyCar.project.carSalesWebiste.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
