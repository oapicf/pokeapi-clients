package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class EncounterPokemonDetail {
    /* The minimum number of perfect IVs, or null if unspecified. */
    Integer minPerfectIvs
    /* Whether the encountered Pokémon is always shiny. */
    Boolean alwaysShiny
    /* Whether the encountered Pokémon can never be shiny. */
    Boolean neverShiny
    /* Whether the encountered Pokémon is an alpha Pokémon. */
    Boolean isAlpha
}
