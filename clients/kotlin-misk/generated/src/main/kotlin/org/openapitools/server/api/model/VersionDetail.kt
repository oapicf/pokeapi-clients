package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionGroupSummary
import org.openapitools.server.api.model.VersionName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<VersionName>,
    val versionGroup: VersionGroupSummary
)
