package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Experience {
    /* The level gained. */
    Integer level
    /* The amount of experience required to reach the referenced level. */
    Integer experience
}
