package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.dto.SalesDto;
import com.agencyCar.project.carSalesWebiste.model.Sale;

import java.util.List;

public interface SaleService {

    List<SalesDto> getAllSales();

    Sale completeNewSale(SalesDto salesDto);

    Sale cancelSale(Long saleId);

    Sale getSaleById(Long saleId);

}
