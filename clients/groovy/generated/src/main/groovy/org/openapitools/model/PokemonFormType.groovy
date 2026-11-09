package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TypeSummary;

@Canonical
class PokemonFormType {
    /* The order the Pokémon's types are listed in. */
    Integer slot
    /* The type the referenced Form has. */
    TypeSummary type
}
