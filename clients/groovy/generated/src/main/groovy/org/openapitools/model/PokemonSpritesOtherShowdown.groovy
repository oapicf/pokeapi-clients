package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PokemonSpritesOtherShowdown {
    /* The URL of the default Pokémon Showdown front image, or null if unavailable. */
    String frontDefault
    /* The URL of the female Pokémon Showdown front image, or null if unavailable. */
    String frontFemale
    /* The URL of the shiny Pokémon Showdown front image, or null if unavailable. */
    String frontShiny
    /* The URL of the shiny female Pokémon Showdown front image, or null if unavailable. */
    String frontShinyFemale
    /* The URL of the default Pokémon Showdown back image, or null if unavailable. */
    String backDefault
    /* The URL of the female Pokémon Showdown back image, or null if unavailable. */
    String backFemale
    /* The URL of the shiny Pokémon Showdown back image, or null if unavailable. */
    String backShiny
    /* The URL of the shiny female Pokémon Showdown back image, or null if unavailable. */
    String backShinyFemale
}
