package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterConditionSummary
import org.openapitools.server.api.model.EncounterConditionValueName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterConditionValueDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val condition: EncounterConditionSummary,
    val names: kotlin.collections.List<EncounterConditionValueName>
)
