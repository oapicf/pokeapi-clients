package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilitySummary;
import org.openapitools.model.GenerationName;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class GenerationDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of abilities that were introduced in this generation. */
    List<AbilitySummary> abilities = new ArrayList<>()
    /* The main region travelled in this generation. */
    RegionSummary mainRegion
    /* A list of moves that were introduced in this generation. */
    List<MoveSummary> moves = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<GenerationName> names = new ArrayList<>()
    /* A list of Pokémon species that were introduced in this generation. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
    /* A list of types that were introduced in this generation. */
    List<TypeSummary> types = new ArrayList<>()
    /* A list of version groups that were introduced in this generation. */
    List<VersionGroupSummary> versionGroups = new ArrayList<>()
}
