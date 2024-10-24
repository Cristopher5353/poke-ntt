package com.nttdata.poke.services;

import com.nttdata.poke.models.english.ResultPokemon;
import com.nttdata.poke.models.spanish.PokemonSpanish;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPokemonService {
    Flux<ResultPokemon> getAllPokemon();
    Mono<PokemonSpanish> getPokemonByName(String name);
}