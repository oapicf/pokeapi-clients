package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.VersionGroupSummary;
import org.openapitools.model.VersionName;

@Canonical
class VersionDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The name of this resource listed in different languages. */
    List<VersionName> names = new ArrayList<>()
    /* The version group this version belongs to. */
    VersionGroupSummary versionGroup
}
