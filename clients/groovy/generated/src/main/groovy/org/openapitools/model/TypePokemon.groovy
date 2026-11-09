package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSummary;

@Canonical
class TypePokemon {
    /* The order the Pokémon's types are listed in. */
    Integer slot
    /* The Pokémon that has the referenced type. */
    PokemonSummary pokemon
}
