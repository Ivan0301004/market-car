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
public class FavoriteCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "favorite_car_id")
    private Long id;

    @OneToMany(mappedBy = "favoriteCar")
    private List<Car> carList;
}
