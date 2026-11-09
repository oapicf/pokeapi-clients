package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonDexNumber {
    /* The index of this Pokémon species entry within the Pokédex. */
    Integer entryNumber
    /* The Pokémon species being encountered. */
    PokemonSpeciesSummary pokemonSpecies
}
