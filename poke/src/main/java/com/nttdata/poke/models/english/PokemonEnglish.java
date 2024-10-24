package com.nttdata.poke.models.english;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonEnglish {
    private List<Ability> abilities;
    private int base_experience;
    private Cry cries;
}