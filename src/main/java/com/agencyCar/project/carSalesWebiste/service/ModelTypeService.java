package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.dto.ModelTypeDto;
import com.agencyCar.project.carSalesWebiste.model.ModelType;

public interface ModelTypeService {

    ModelType createModelType(ModelTypeDto modelType);

    ModelType updateModelType(ModelTypeDto modelType);
}
