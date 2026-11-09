package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.PokemonSpritesOther;

@Canonical
class PokemonSprites {
    /* The default depiction of this Pokémon from the front in battle. */
    String frontDefault
    /* The shiny depiction of this Pokémon from the front in battle. */
    String frontShiny
    /* The female depiction of this Pokémon from the front in battle. */
    String frontFemale
    /* The shiny female depiction of this Pokémon from the front in battle. */
    String frontShinyFemale
    /* The default depiction of this Pokémon from the back in battle. */
    String backDefault
    /* The shiny depiction of this Pokémon from the back in battle. */
    String backShiny
    /* The female depiction of this Pokémon from the back in battle. */
    String backFemale
    /* The shiny female depiction of this Pokémon from the back in battle. */
    String backShinyFemale
    /* Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. */
    PokemonSpritesOther other
    /* Sprites grouped by generation and game. Available keys vary by resource. */
    Map<String, Map<String, Object>> versions = new HashMap<>()
}
