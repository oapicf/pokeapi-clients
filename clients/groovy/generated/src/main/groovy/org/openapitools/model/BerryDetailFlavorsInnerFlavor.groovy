package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class BerryDetailFlavorsInnerFlavor {
    /* The name of the flavor */
    String name
    /* The URL to get more information about the flavor */
    URI url
}
