package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PalParkAreaSummary;

@Canonical
class PokemonSpeciesPalParkEncounter {
    /* The base score given to the player when the referenced Pokémon is caught during a pal park run. */
    Integer baseScore
    /* The base rate for encountering the referenced Pokémon in this pal park area. */
    Integer rate
    /* The pal park area where this encounter happens. */
    PalParkAreaSummary area
}
