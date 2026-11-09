package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class MachineDetail {
    /* The identifier for this resource. */
    Integer id
    /* The TM or HM item that corresponds to this machine. */
    ItemSummary item
    /* The version group that this machine applies to. */
    VersionGroupSummary versionGroup
    /* The move that is taught by this machine. */
    MoveSummary move
}
