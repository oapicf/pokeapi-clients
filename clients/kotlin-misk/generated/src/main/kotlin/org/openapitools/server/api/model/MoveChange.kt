package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveEffectEffectText
import org.openapitools.server.api.model.TypeSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveChange(
    /** The percent value of how likely it is this moves effect will take effect. */
    val effectChance: kotlin.Int,
    /** The effect of this move listed in different languages. */
    val effectEntries: kotlin.collections.List<MoveEffectEffectText>,
    /** The elemental type of this move. */
    val type: TypeSummary,
    /** The version group in which these move stat values were in effect. */
    val versionGroup: VersionGroupSummary,
    /** The percent value of how likely this move is to be successful. */
    val accuracy: kotlin.Int? = null,
    /** The base power before the listed version group, or null if power did not change. */
    val power: kotlin.Int? = null,
    /** Power points. The number of times this move can be used. */
    val pp: kotlin.Int? = null
)
