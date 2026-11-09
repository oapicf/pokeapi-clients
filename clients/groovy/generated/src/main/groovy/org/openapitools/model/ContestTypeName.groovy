package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

@Canonical
class ContestTypeName {
    /* The name for this contest. */
    String name
    /* The color associated with this contest's name. */
    String color
    /* The language that this name is in. */
    LanguageSummary language
}
