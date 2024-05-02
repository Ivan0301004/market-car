package com.agencyCar.project.carSalesWebiste.service.implementation;

import com.agencyCar.project.carSalesWebiste.dto.SalesDto;
import com.agencyCar.project.carSalesWebiste.model.Sale;
import com.agencyCar.project.carSalesWebiste.respository.SalesRepository;
import com.agencyCar.project.carSalesWebiste.service.SaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SaleService {

    private final SalesRepository salesRepository;

    public SalesServiceImpl(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public List<SalesDto> getAllSales() {
        return null;
    }

    @Override
    public Sale completeNewSale(SalesDto salesDto) {
        return null;
    }

    @Override
    public Sale cancelSale(Long saleId) {
        return null;
    }

    @Override
    public Sale getSaleById(Long saleId) {
        return null;
    }
}
