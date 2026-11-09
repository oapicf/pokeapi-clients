package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.ContestTypeName;

@Canonical
class ContestTypeDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The berry flavor that correlates with this contest type. */
    BerryFlavorSummary berryFlavor
    /* The name of this contest type listed in different languages. */
    List<ContestTypeName> names = new ArrayList<>()
}
