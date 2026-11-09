package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveComboUsage;

@Canonical
class MoveCombos {
    /* A detail of moves this move can be used before or after, granting additional appeal points in contests. */
    MoveComboUsage normal
    /* A detail of moves this move can be used before or after, granting additional appeal points in super contests. */
    MoveComboUsage _super
}
