package com.nttdata.poke.models.english;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ability {
    private AbilityDetail ability;
    private int slot;
}