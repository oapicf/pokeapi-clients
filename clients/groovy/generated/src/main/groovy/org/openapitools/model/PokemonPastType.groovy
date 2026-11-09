package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonType;

@Canonical
class PokemonPastType {
    /* The last generation in which the referenced pokémon had the listed types. */
    GenerationSummary generation
    /* The types the referenced pokémon had up to and including the listed generation. */
    List<PokemonType> types = new ArrayList<>()
}
