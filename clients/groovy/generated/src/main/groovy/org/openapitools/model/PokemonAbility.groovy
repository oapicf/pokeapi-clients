package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilitySummary;

@Canonical
class PokemonAbility {
    /* Whether or not this is a hidden ability. */
    Boolean isHidden
    /* The slot this ability occupies in this Pokémon species. */
    Integer slot
    /* The ability the Pokémon may have. */
    AbilitySummary ability
}
