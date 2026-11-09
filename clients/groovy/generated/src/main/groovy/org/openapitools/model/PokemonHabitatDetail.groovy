package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonHabitatName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonHabitatDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The name of this resource listed in different languages. */
    List<PokemonHabitatName> names = new ArrayList<>()
    /* A list of the Pokémon species that can be found in this habitat. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
