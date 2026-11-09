package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class EvolutionVariableSummary {
    /* The name of the referenced resource. */
    String name
    /* The URL of the referenced resource. */
    URI url
}
