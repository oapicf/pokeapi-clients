@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveChange(
    @field:JsonProperty("effect_chance")
    val effectChance: kotlin.Int,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<MoveChangeEffectEntriesInner>,

    @field:JsonProperty("type")
    val type: TypeSummary,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("accuracy")
    val accuracy: kotlin.Int? = null,

    @field:JsonProperty("power")
    val power: kotlin.Int? = null,

    @field:JsonProperty("pp")
    val pp: kotlin.Int? = null,

)
