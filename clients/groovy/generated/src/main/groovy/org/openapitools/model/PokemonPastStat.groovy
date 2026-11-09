package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonStat;

@Canonical
class PokemonPastStat {
    /* The last generation in which the referenced pokémon had the listed stats. */
    GenerationSummary generation
    /* The stat the Pokémon had up to and including the listed generation. */
    List<PokemonStat> stats = new ArrayList<>()
}
