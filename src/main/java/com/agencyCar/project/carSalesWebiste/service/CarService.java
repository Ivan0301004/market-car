package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.dto.CarDto;
import com.agencyCar.project.carSalesWebiste.dto.CarImagesDto;
import com.agencyCar.project.carSalesWebiste.dto.CommentDto;
import com.agencyCar.project.carSalesWebiste.model.Car;

import java.util.List;

public interface CarService {

    Car createCar(CarDto carDto);

    CarDto removeCar(Long carId);

    CarDto updateCar(Long carId);

    CarDto getCarById(Long carId);

    CarDto patchCar(Long carId, CarDto carDto);

    CarImagesDto addImagesToCar(Long carId, List<CarImagesDto> carImagesDto);

    CommentDto addCommentToCar(Long carId, CommentDto commentDto);

    CommentDto removeCommentFromCar(Long carId, Long commentId);
}
