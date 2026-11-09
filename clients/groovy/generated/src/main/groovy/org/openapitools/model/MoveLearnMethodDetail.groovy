package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveLearnMethodDescription;
import org.openapitools.model.MoveLearnMethodName;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class MoveLearnMethodDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The name of this resource listed in different languages. */
    List<MoveLearnMethodName> names = new ArrayList<>()
    /* The description of this resource listed in different languages. */
    List<MoveLearnMethodDescription> descriptions = new ArrayList<>()
    /* A list of version groups where moves can be learned through this method. */
    List<VersionGroupSummary> versionGroups = new ArrayList<>()
}
