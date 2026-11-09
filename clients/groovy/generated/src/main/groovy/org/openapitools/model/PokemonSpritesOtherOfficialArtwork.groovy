package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class PokemonSpritesOtherOfficialArtwork {
    /* The URL of the default front official artwork, or null if unavailable. */
    String frontDefault
    /* The URL of the shiny front official artwork, or null if unavailable. */
    String frontShiny
    /* Additional official artwork grouped by version. Available keys vary by resource. */
    Map<String, Map<String, Object>> versions = new HashMap<>()
}
