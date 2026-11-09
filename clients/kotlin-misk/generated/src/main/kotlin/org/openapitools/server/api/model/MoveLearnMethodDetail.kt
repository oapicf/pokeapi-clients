package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveLearnMethodDescription
import org.openapitools.server.api.model.MoveLearnMethodName
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveLearnMethodDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<MoveLearnMethodName>,
    /** The description of this resource listed in different languages. */
    val descriptions: kotlin.collections.List<MoveLearnMethodDescription>,
    /** A list of version groups where moves can be learned through this method. */
    val versionGroups: kotlin.collections.List<VersionGroupSummary>
)
