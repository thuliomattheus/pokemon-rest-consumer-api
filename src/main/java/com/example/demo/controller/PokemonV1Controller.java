package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.PokemonDto;

@RestController
@RequestMapping("/v1/pokemon")
public class PokemonV1Controller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{pokedexId}")
	public PokemonDto getPokemonByPokedexNumber(@PathVariable final int pokedexId) {
		String uriString = "https://pokeapi.co/api/v2/pokemon/" + pokedexId;
		return restTemplate.getForObject(uriString, PokemonDto.class);
	}
}
