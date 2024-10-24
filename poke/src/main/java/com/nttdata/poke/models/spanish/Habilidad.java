package com.nttdata.poke.models.spanish;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Habilidad {
    private DetalleHabilidad habilidad;
    private int slot;
}
