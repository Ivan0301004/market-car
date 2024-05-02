package com.agencyCar.project.carSalesWebiste.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private String textComment;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

}
