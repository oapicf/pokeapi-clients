package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GenderPokemonSpecies;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class GenderDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of Pokémon species that can be this gender and how likely it is that they will be. */
    List<GenderPokemonSpecies> pokemonSpeciesDetails = new ArrayList<>()
    /* A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. */
    List<PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>()
}
