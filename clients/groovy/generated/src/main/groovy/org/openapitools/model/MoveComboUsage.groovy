package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveSummary;

@Canonical
class MoveComboUsage {
    /* A list of moves to use before this move. */
    List<MoveSummary> useBefore
    /* A list of moves to use after this move. */
    List<MoveSummary> useAfter
}
