package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSummary;

@Canonical
class AbilityPokemonDetail {
    /* Whether or not this a hidden ability for the referenced Pokémon. */
    Boolean isHidden
    /* Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. */
    Integer slot
    /* The Pokémon this ability could belong to. */
    PokemonSummary pokemon
}
