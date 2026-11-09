package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VersionSummary;

@Canonical
class PokemonHeldItemVersion {
    /* How often the item is held. */
    Integer rarity
    /* The version in which the item is held. */
    VersionSummary version
}
