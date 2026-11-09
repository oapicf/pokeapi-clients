package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonHeldItemVersion;
import org.openapitools.model.PokemonSummary;

@Canonical
class PokemonHeldItem {
    /* The Pokémon that holds this item. */
    PokemonSummary pokemon
    /* The details for the version that this item is held in by the Pokémon. */
    List<PokemonHeldItemVersion> versionDetails = new ArrayList<>()
}
