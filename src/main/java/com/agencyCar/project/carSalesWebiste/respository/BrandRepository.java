package com.agencyCar.project.carSalesWebiste.respository;

import com.agencyCar.project.carSalesWebiste.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
