package com.nttdata.poke.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import com.nttdata.poke.models.english.Ability;
import com.nttdata.poke.models.english.AbilityDetail;
import com.nttdata.poke.models.english.Cry;
import com.nttdata.poke.models.english.PokemonEnglish;
import com.nttdata.poke.models.spanish.DetalleHabilidad;
import com.nttdata.poke.models.spanish.Habilidad;
import com.nttdata.poke.models.spanish.PokemonSpanish;
import com.nttdata.poke.models.spanish.Sonido;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PokemonMapper {
    @Mapping(source = "abilities", target = "habilidades")
    @Mapping(source = "base_experience", target = "experienciaBase")
    @Mapping(source = "cries", target = "sonidos")
    PokemonSpanish toSpanish(PokemonEnglish pokemonEnglish);

    @Mapping(source = "ability", target = "habilidad")
    @Mapping(source = "slot", target = "slot")
    Habilidad toSpanish(Ability ability);

    @Mapping(source = "name", target = "nombre")
    DetalleHabilidad toSpanish(AbilityDetail abilityDetail);

    @Mapping(source = "latest", target = "ultimo")
    @Mapping(source = "legacy", target = "legado")
    Sonido toSpanish(Cry cry);
}