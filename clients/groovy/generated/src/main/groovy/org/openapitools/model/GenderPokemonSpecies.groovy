package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class GenderPokemonSpecies {
    /* The chance of this Pokémon being female, in eighths; or -1 for genderless. */
    Integer rate
    /* A Pokémon species that can be the referenced gender. */
    PokemonSpeciesSummary pokemonSpecies
}
