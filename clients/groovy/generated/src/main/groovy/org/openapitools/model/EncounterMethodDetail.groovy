package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EncounterMethodName;

@Canonical
class EncounterMethodDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A good value for sorting. */
    Integer order
    /* The name of this resource listed in different languages. */
    List<EncounterMethodName> names = new ArrayList<>()
}
