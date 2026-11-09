package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonColorName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonColorDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The name of this resource listed in different languages. */
    List<PokemonColorName> names = new ArrayList<>()
    /* A list of the Pokémon species that have this color. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
