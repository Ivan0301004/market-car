package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.dto.LocationDto;

public interface LocationService {

    LocationDto createLocation(LocationDto locationDto);

    LocationDto removeLocation(Long locationId);
}
