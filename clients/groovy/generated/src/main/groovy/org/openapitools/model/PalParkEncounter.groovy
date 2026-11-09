package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PalParkEncounter {
    /* The base score given to the player when this Pokémon is caught during a pal park run. */
    Integer baseScore
    /* The base rate for encountering this Pokémon in this pal park area. */
    Integer rate
    /* The Pokémon species being encountered. */
    PokemonSpeciesSummary pokemonSpecies
}
