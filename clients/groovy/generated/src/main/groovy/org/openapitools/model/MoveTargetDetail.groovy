package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.MoveTargetDescription;
import org.openapitools.model.MoveTargetName;

@Canonical
class MoveTargetDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The description of this resource listed in different languages. */
    List<MoveTargetDescription> descriptions = new ArrayList<>()
    /* A list of moves that that are directed at this target. */
    List<MoveSummary> moves = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<MoveTargetName> names = new ArrayList<>()
}
