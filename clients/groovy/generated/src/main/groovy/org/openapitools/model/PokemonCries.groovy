package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PokemonCries {
    /* The latest depiction of this Pokémon's cry. */
    String latest
    /* The legacy depiction of this Pokémon's cry. */
    String legacy
}
