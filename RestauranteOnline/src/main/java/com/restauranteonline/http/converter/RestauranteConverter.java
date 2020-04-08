package com.restauranteonline.http.converter;

import static java.util.Objects.isNull;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restauranteonline.http.dto.response.RestauranteResponse;
import com.restauranteonline.usecase.dto.response.RestauranteOutput;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RestauranteConverter {

	public List<RestauranteResponse> ParaCamadaController(List<RestauranteOutput> restaurantes) {
		
		if(isNull(restaurantes)) {
			return null;
		}
		
		List<RestauranteResponse> listaRestauranteResponse = new ArrayList<>();
		
		restaurantes.forEach(
				e -> listaRestauranteResponse.add(toRestauranteResponse(e)) );
		
		return listaRestauranteResponse;
	}

	private RestauranteResponse toRestauranteResponse(RestauranteOutput restaurantes) {
		
		if(isNull(restaurantes)) {
			return null;
		}
		
		return RestauranteResponse.builder()
				.nome(restaurantes.getNome())
				.localidade(restaurantes.getLocalidade())
				.tipo(restaurantes.getTipo()).build();
	}

}
