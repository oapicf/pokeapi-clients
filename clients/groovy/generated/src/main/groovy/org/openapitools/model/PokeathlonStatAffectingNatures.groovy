package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokeathlonStatAffectingNature;

@Canonical
class PokeathlonStatAffectingNatures {
    /* A list of natures and how they change the referenced Pokéathlon stat. */
    List<PokeathlonStatAffectingNature> increase = new ArrayList<>()
    /* A list of natures and how they change the referenced Pokéathlon stat. */
    List<PokeathlonStatAffectingNature> decrease = new ArrayList<>()
}
