package com.example.demo.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PokemonDto;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@GetMapping("/{pokedexId}")
	public PokemonDto getPokemonNameByPokedexNumber(@PathVariable final int pokedexId) throws URISyntaxException, IOException, InterruptedException {
		String uriString = "https://pokeapi.co/api/v2/pokemon/" + pokedexId;

		HttpRequest request = HttpRequest.newBuilder()
			.uri(new URI(uriString))
			.GET()
			.build();

		HttpResponse<String> client = HttpClient.newBuilder()
			.build()
			.send(request, BodyHandlers.ofString());

		return new ObjectMapper().readValue(client.body(), PokemonDto.class);
	}
}