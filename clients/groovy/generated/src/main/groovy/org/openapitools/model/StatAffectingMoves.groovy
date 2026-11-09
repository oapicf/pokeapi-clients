package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveStatChange;

@Canonical
class StatAffectingMoves {
    /* A list of moves and how they change the referenced stat. */
    List<MoveStatChange> increase = new ArrayList<>()
    /* A list of moves and how they change the referenced stat. */
    List<MoveStatChange> decrease = new ArrayList<>()
}
