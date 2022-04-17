package com.example.demo.util;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.demo.dto.PokemonDto;

public class StreamUtils {

  private StreamUtils() {}

  private static int intArray[] = new int[] {1, 2, 3};
  private static String stringArray[] = new String[] {"AEIOU", "RARERIRORU", "KKKKKK"};
  private static PokemonDto pokemonArray[] = new PokemonDto[] {
      new PokemonDto(1, "Bulbasaur"),
      new PokemonDto(4, "Squirtle"),
      new PokemonDto(7, "Charmander")
  };

  public static void testMap() {
  }

  public static void main(String[] args) {
    Arrays.stream(intArray).forEach(System.out::println);
    Arrays.stream(stringArray).forEach(System.out::println);
    Arrays.stream(pokemonArray).map(PokemonDto::getName).forEach(System.out::println);
    Arrays.stream(intArray).map(Integer::valueOf).forEach(System.out::println);
    Arrays.stream(intArray).flatMap(Integer::toString).forEach(System.out::println);
  }
}
