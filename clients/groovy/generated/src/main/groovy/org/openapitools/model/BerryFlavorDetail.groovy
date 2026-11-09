package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorBerryMap;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;

@Canonical
class BerryFlavorDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of the berries with this flavor. */
    List<BerryFlavorBerryMap> berries = new ArrayList<>()
    /* The contest type that correlates with this berry flavor. */
    ContestTypeSummary contestType
    /* The name of this resource listed in different languages. */
    List<BerryFlavorName> names = new ArrayList<>()
}
