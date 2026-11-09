package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.PokemonHeldItemVersion;

@Canonical
class PokemonHeldItemSummary {
    /* The item the referenced Pokémon holds. */
    ItemSummary item
    /* The details of the different versions in which the item is held. */
    List<PokemonHeldItemVersion> versionDetails = new ArrayList<>()
}
