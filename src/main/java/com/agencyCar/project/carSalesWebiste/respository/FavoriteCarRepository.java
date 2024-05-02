package com.agencyCar.project.carSalesWebiste.respository;

import com.agencyCar.project.carSalesWebiste.model.FavoriteCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteCarRepository extends JpaRepository<FavoriteCar, Long> {
}
