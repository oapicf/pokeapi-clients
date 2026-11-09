package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EvolutionTriggerName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class EvolutionTriggerDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The name of this resource listed in different languages. */
    List<EvolutionTriggerName> names = new ArrayList<>()
    /* A list of pokemon species that result from this evolution trigger. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
