@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemMachine(
    @field:JsonProperty("machine")
    val machine: MachineSummary,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

)
