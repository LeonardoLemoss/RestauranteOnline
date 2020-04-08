package com.restauranteonline.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restauranteonline.entity.RestauranteEntity;
import com.restauranteonline.gateway.repository.RestauranteRepository;
import com.restauranteonline.usecase.dto.response.RestauranteOutput;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RestauranteUseCase {
	
	private final RestauranteRepository repository;
	

	public List<RestauranteOutput> buscaRestaurantes() {
		
		List<RestauranteEntity> listaRestauranteEntity =
				repository.findAll();
		
		return null;
	}

}
