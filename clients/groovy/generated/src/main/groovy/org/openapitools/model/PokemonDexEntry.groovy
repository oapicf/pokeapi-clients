package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokedexSummary;

@Canonical
class PokemonDexEntry {
    /* The index number within the Pokédex. */
    Integer entryNumber
    /* The Pokédex the referenced Pokémon species can be found in. */
    PokedexSummary pokedex
}
