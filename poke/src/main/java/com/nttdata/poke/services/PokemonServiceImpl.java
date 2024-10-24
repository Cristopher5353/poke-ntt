package com.nttdata.poke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.nttdata.poke.mappers.PokemonMapper;
import com.nttdata.poke.models.english.PokemonEnglish;
import com.nttdata.poke.models.english.PokemonFlux;
import com.nttdata.poke.models.english.ResultPokemon;
import com.nttdata.poke.models.spanish.PokemonSpanish;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PokemonServiceImpl implements IPokemonService {
    @Autowired
    private WebClient.Builder webClientBuilder;
    
    @Autowired
    private PokemonMapper pokemonMapper;

    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon";

    @Override
    public Flux<ResultPokemon> getAllPokemon() {
        return webClientBuilder.build()
            .get()
            .uri(API_URL)
            .retrieve()
            .bodyToMono(PokemonFlux.class)
            .flatMapMany(pokemonFlux -> Flux.fromIterable(pokemonFlux.getResults()));
    }

    @Override
    public Mono<PokemonSpanish> getPokemonByName(String name) {
        return webClientBuilder.build()
            .get()
            .uri(API_URL + "/{name}", name)
            .retrieve()
            .bodyToMono(PokemonEnglish.class)
            .map(pokemonEnglish -> pokemonMapper.toSpanish(pokemonEnglish));
    }
}