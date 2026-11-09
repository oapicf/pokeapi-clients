package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VersionSummary;

@Canonical
class LocationAreaEncounterVersionDetail {
    /* The chance of an encounter to occur. */
    Integer rate
    /* The version of the game in which the encounter can occur with the given chance. */
    VersionSummary version
}
