package com.agencyCar.project.carSalesWebiste.respository;

import com.agencyCar.project.carSalesWebiste.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
