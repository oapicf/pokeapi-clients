package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class TypeDetailPokemonInnerPokemon {
    /* The name of the pokemon */
    String name
    /* The URL to get more information about the pokemon */
    URI url
}
