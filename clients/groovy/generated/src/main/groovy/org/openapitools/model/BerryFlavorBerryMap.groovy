package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerrySummary;

@Canonical
class BerryFlavorBerryMap {
    /* How powerful the referenced flavor is for this berry. */
    Integer potency
    /* The berry with the referenced flavor. */
    BerrySummary berry
}
