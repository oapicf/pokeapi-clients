package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokeathlonStatSummary;

@Canonical
class NaturePokeathlonStat {
    /* The amount of change. */
    Integer maxChange
    /* The stat being affected. */
    PokeathlonStatSummary pokeathlonStat
}
