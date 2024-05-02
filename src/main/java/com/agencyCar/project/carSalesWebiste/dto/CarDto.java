package com.agencyCar.project.carSalesWebiste.dto;

import com.agencyCar.project.carSalesWebiste.model.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class CarDto {

    private long id;

    private String name;

    private String year;

    private String mileage;

    private String description;

    private Sale sale;

    private List<Comment> commentsList;

    private List<CarImage> carImagesList;

    private Location location;

    private ModelType modelType;

    private FavoriteCar favoriteCar;

    private ModelSubtype modelSubtype;

    private Brand brand;
}
