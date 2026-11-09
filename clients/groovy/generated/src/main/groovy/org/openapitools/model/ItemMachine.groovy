package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MachineSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class ItemMachine {
    /* The machine that teaches a move from an item. */
    MachineSummary machine
    /* The version group of this specific machine. */
    VersionGroupSummary versionGroup
}
