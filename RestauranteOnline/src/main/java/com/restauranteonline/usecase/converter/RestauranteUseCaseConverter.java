package com.restauranteonline.usecase.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.restauranteonline.entity.RestauranteEntity;
import com.restauranteonline.usecase.dto.response.RestauranteOutput;

import lombok.RequiredArgsConstructor;

import static java.util.Objects.isNull;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class RestauranteUseCaseConverter {

	public List<RestauranteOutput> ParaUsecaseRestaurantes(List<RestauranteEntity> listaRestauranteEntity) {
		
		if(isNull(listaRestauranteEntity)) {
			return null;
		}
		
		List<RestauranteOutput> listaRestaurantes = new ArrayList<>();
		
		listaRestauranteEntity.forEach(
				e -> listaRestaurantes.add(toUseCaseRestaurantes(e)));
		
		
		
		return null;
	}

	private RestauranteOutput toUseCaseRestaurantes(RestauranteEntity e) {
		
		if(isNull(e)) {
			return null;
		}
		
		return RestauranteOutput.builder()
				.nome(e.getNome())
				.localidade(e.getLocalidade())
				.tipo(e.getTipo())
				.build();
	}

}
