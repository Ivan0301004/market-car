package com.agencyCar.project.carSalesWebiste.respository;

import com.agencyCar.project.carSalesWebiste.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sale, Long> {
}
