package com.restauranteonline.http;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restauranteonline.http.dto.response.PedidoResponse;
import com.restauranteonline.http.dto.response.RestauranteResponse;

@RestController
@RequestMapping("/restautante")
public interface RestauranteController {
	
	@GetMapping
	public List<RestauranteResponse> listaRestaurantes();
	
	@RequestMapping(value = "/tipo/{tipo}", method = RequestMethod.GET, produces="application/json")
	public List<RestauranteResponse> pesquisaRestaurantePeloTipo(@PathVariable(value = "tipo") String tipo);
	
	
	@RequestMapping(value = "/localidade/{sigla}", method = RequestMethod.GET, produces="application/json")
	public List<RestauranteResponse> pesquisaRestaurantePelaLocalidade(@PathVariable(value = "sigla") String sigla);
	
	@PostMapping(value = "/pedido", produces="application/json")
	public PedidoResponse encaminhaPedido (PedidoResponse pedido);
	
}
