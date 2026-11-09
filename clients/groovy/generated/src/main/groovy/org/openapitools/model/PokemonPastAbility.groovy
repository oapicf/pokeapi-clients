package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonAbilityPast;

@Canonical
class PokemonPastAbility {
    /* The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. */
    List<PokemonAbilityPast> abilities = new ArrayList<>()
    /* The last generation in which the referenced pokémon had the listed abilities. */
    GenerationSummary generation
}
