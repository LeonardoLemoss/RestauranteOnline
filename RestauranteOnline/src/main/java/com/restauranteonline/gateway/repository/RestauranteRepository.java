package com.restauranteonline.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restauranteonline.entity.RestauranteEntity;

public interface RestauranteRepository  extends JpaRepository<RestauranteEntity, Long>{

}
