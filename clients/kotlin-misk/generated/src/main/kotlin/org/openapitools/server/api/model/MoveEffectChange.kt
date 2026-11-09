package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveEffectChangeEffectText
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveEffectChange(
    /** The version group in which the previous effect of this ability originated. */
    val versionGroup: VersionGroupSummary,
    /** The previous effect of this ability listed in different languages. */
    val effectEntries: kotlin.collections.List<MoveEffectChangeEffectText>
)
