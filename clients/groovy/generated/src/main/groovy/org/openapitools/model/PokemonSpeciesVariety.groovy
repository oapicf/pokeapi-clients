package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSummary;

@Canonical
class PokemonSpeciesVariety {
    /* Whether this variety is the default variety. */
    Boolean isDefault
    /* The Pokémon variety. */
    PokemonSummary pokemon
}
