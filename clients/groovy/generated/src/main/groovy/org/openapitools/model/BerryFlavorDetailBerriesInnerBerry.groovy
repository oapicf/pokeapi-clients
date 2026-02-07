package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class BerryFlavorDetailBerriesInnerBerry {
    /* The name of the berry */
    String name
    /* The URL to get more information about the berry */
    URI url
}
