package com.restauranteonline.usecase.dto.response;

import com.restauranteonline.utils.TipoRestauranteEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteOutput {

	private String nome;
	private TipoRestauranteEnum tipo;
	private String localidade;
	
	
}
