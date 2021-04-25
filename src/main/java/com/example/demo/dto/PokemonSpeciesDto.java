package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesDto {

	private int id;
	private String name;

	@JsonProperty(value = "is_baby")
	private boolean baby;

	@JsonProperty(value = "is_legendary")
	private boolean legendary;

	@JsonProperty(value = "is_mythical")
	private boolean mythical;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBaby() {
		return baby;
	}

	public void setBaby(boolean baby) {
		this.baby = baby;
	}

	public boolean isLegendary() {
		return legendary;
	}

	public void setLegendary(boolean legendary) {
		this.legendary = legendary;
	}

	public boolean isMythical() {
		return mythical;
	}

	public void setMythical(boolean mythical) {
		this.mythical = mythical;
	}
}