package com.agencyCar.project.carSalesWebiste.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelSubtype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_subtype_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "modelSubtype")
    private List<Car> carList;
}
