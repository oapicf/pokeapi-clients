package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class GrowthRateDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The formula used to calculate the rate at which the Pokémon species gains level. */
    String formula
    /* The descriptions of this characteristic listed in different languages. */
    List<GrowthRateDescription> descriptions = new ArrayList<>()
    /* A list of levels and the amount of experienced needed to atain them based on this growth rate. */
    List<Experience> levels = new ArrayList<>()
    /* A list of Pokémon species that gain levels at this growth rate. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
