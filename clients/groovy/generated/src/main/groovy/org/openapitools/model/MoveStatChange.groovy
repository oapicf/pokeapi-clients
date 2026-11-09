package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveSummary;

@Canonical
class MoveStatChange {
    /* The maximum amount of change to the referenced stat. */
    Integer change
    /* The move causing the change. */
    MoveSummary move
}
