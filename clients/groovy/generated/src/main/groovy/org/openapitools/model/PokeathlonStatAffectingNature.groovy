package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NatureSummary;

@Canonical
class PokeathlonStatAffectingNature {
    /* The maximum amount of change to the referenced Pokéathlon stat. */
    Integer maxChange
    /* The nature causing the change. */
    NatureSummary nature
}
