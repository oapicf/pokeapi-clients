package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveChangeEffectEntriesInner
import org.openapitools.server.api.model.TypeSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveChange(
    val effectChance: kotlin.Int,
    val effectEntries: kotlin.collections.List<MoveChangeEffectEntriesInner>,
    val type: TypeSummary,
    val versionGroup: VersionGroupSummary,
    val accuracy: kotlin.Int? = null,
    val power: kotlin.Int? = null,
    val pp: kotlin.Int? = null
)
