package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerryFlavorSummary;

@Canonical
class BerryFlavorMap {
    /* How powerful the referenced flavor is for this berry. */
    Integer potency
    /* The referenced berry flavor. */
    BerryFlavorSummary flavor
}
