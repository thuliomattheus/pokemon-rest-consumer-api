package com.example.demo.controller;

import com.example.demo.dto.PokemonSpeciesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/pokemon-species")
public class PokemonSpeciesV1Controller {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/{pokedexId}")
    public PokemonSpeciesDto getPokemonNameByPokedexNumber(@PathVariable final int pokedexId) {
    String uriString = "https://pokeapi.co/api/v2/pokemon-species/" + pokedexId;

    return restTemplate.getForObject(uriString, PokemonSpeciesDto.class);
  }
}
