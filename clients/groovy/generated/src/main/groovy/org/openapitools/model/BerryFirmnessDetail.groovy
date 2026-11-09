package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFirmnessName;
import org.openapitools.model.BerrySummary;

@Canonical
class BerryFirmnessDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of the berries with this firmness. */
    List<BerrySummary> berries = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<BerryFirmnessName> names = new ArrayList<>()
}
