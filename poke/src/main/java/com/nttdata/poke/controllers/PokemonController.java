package com.nttdata.poke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nttdata.poke.models.english.ResultPokemon;
import com.nttdata.poke.models.spanish.PokemonSpanish;
import com.nttdata.poke.services.IPokemonService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @Autowired
    private IPokemonService iPokemonService;

    @GetMapping
    public Flux<ResultPokemon> getAllPokemon() {
        return iPokemonService.getAllPokemon();
    }

    @GetMapping("/{name}")
    public Mono<PokemonSpanish> getPokemonByName(@PathVariable String name) {
        return iPokemonService.getPokemonByName(name);
    }
}