package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveMetaCategoryDescription;
import org.openapitools.model.MoveSummary;

@Canonical
class MoveMetaCategoryDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The description of this resource listed in different languages. */
    List<MoveMetaCategoryDescription> descriptions = new ArrayList<>()
    /* A list of moves that fall into this category. */
    List<MoveSummary> moves = new ArrayList<>()
}
