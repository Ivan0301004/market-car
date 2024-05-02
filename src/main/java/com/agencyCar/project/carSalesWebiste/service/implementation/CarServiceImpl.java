package com.agencyCar.project.carSalesWebiste.service.implementation;

import com.agencyCar.project.carSalesWebiste.dto.CarDto;
import com.agencyCar.project.carSalesWebiste.dto.CarImagesDto;
import com.agencyCar.project.carSalesWebiste.dto.CommentDto;
import com.agencyCar.project.carSalesWebiste.mappers.CarMapper;
import com.agencyCar.project.carSalesWebiste.mappers.CommentMapper;
import com.agencyCar.project.carSalesWebiste.model.Car;
import com.agencyCar.project.carSalesWebiste.respository.CarRepository;
import com.agencyCar.project.carSalesWebiste.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;
    private final CommentMapper commentMapper;

    public CarServiceImpl(CarRepository carRepository, CarMapper carMapperl, CommentMapper commentMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapperl;
        this.commentMapper = commentMapper;
    }

    @Override
    public Car createCar(CarDto carDto) {
        return null;
    }

    @Override
    public CarDto removeCar(Long carId) {
        return null;
    }

    @Override
    public CarDto updateCar(Long carId) {
        return null;
    }

    @Override
    public CarDto getCarById(Long carId) {
        return null;
    }

    @Override
    public CarDto patchCar(Long carId, CarDto carDto) {
        return null;
    }

    @Override
    public CarImagesDto addImagesToCar(Long carId, List<CarImagesDto> carImagesDto) {
        return null;
    }

    @Override
    public CommentDto addCommentToCar(Long carId, CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto removeCommentFromCar(Long carId, Long commentId) {
        return null;
    }
}
