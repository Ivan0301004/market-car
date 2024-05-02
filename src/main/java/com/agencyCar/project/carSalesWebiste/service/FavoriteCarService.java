package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.dto.CarDto;

public interface FavoriteCarService {

    CarDto addCar(Long favoriteId, Long carId);

    CarDto removeCar(Long favoriteId, Long carId);
}
