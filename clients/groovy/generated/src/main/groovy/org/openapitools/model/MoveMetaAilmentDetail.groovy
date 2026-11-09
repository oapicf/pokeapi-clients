package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveMetaAilmentName;
import org.openapitools.model.MoveSummary;

@Canonical
class MoveMetaAilmentDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of moves that cause this ailment. */
    List<MoveSummary> moves = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<MoveMetaAilmentName> names = new ArrayList<>()
}
