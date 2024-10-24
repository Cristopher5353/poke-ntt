package com.nttdata.poke.models.spanish;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonSpanish {
    private List<Habilidad> habilidades;
    private int experienciaBase;
    private Sonido sonidos;
}