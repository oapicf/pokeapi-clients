package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PokemonSpritesOtherDreamWorld {
    /* The URL of the default Pokémon Dream World front image, or null if unavailable. */
    String frontDefault
    /* The URL of the female Pokémon Dream World front image, or null if unavailable. */
    String frontFemale
}
