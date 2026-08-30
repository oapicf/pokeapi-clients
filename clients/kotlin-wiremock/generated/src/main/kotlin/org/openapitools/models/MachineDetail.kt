@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MachineDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("item")
    val item: ItemSummary,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("move")
    val move: MoveSummary,

)
