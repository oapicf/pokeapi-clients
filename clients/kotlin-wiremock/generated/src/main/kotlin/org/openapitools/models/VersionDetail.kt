@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VersionDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<VersionName>,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

)
