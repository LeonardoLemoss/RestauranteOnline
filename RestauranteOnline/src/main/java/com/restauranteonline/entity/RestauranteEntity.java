package com.restauranteonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.restauranteonline.utils.TipoRestauranteEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TB_RESTAURANTE")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VEICULO")
	private Long id;
	
	@Column(name = "DS_RESTAURANTE")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "FL_TIPO")
	private TipoRestauranteEnum tipo;
	
	@Column(name = "DS_LOCALIDADE")
	private String localidade;

}
