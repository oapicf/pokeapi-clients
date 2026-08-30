@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AbilityChange(
    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<AbilityChangeEffectText>,

)
