package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EggGroupName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class EggGroupDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The name of this resource listed in different languages. */
    List<EggGroupName> names = new ArrayList<>()
    /* A list of all Pokémon species that are members of this egg group. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
