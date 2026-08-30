package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityChangeEffectText
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityChange(
    val versionGroup: VersionGroupSummary,
    val effectEntries: kotlin.collections.List<AbilityChangeEffectText>
)
