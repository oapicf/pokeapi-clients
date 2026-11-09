package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class EvolutionChainLink {
    /* Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. */
    Boolean isBaby
    /* The Pokémon species at this point in the evolution chain. */
    PokemonSpeciesSummary species
    /* All details regarding the specific details of the referenced Pokémon species evolution. */
    List<PokemonEvolution> evolutionDetails = new ArrayList<>()
    /* A List of chain objects. */
    List<EvolutionChainLink> evolvesTo = new ArrayList<>()
}
