package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionGroupSummary
import org.openapitools.server.api.model.VersionName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<VersionName>,
    /** The version group this version belongs to. */
    val versionGroup: VersionGroupSummary
)
