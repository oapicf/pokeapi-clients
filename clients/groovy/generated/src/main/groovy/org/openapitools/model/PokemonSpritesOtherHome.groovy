package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PokemonSpritesOtherHome {
    /* The URL of the default Pokémon HOME front image, or null if unavailable. */
    String frontDefault
    /* The URL of the female Pokémon HOME front image, or null if unavailable. */
    String frontFemale
    /* The URL of the shiny Pokémon HOME front image, or null if unavailable. */
    String frontShiny
    /* The URL of the shiny female Pokémon HOME front image, or null if unavailable. */
    String frontShinyFemale
}
