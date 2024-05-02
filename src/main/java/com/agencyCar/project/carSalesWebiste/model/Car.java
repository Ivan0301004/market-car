package com.agencyCar.project.carSalesWebiste.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Car extends BaseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long id;

    private String name;

    private String year;

    private String mileage;

    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Sale sale;

    @OneToMany(mappedBy = "car")
    private List<Comment> commentsList;

    @OneToMany(mappedBy = "car")
    private List<CarImage> carImagesList;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "model_type_id")
    private ModelType modelType;

    @ManyToOne
    @JoinColumn(name = "favorite_car")
    private FavoriteCar favoriteCar;

    @ManyToOne
    @JoinColumn(name = "model_subtype_id")
    private ModelSubtype modelSubtype;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

}
