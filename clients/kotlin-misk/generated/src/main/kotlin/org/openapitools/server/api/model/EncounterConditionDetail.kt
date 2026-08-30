package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterConditionName
import org.openapitools.server.api.model.EncounterConditionValueSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterConditionDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val propertyValues: kotlin.collections.List<EncounterConditionValueSummary>,
    val names: kotlin.collections.List<EncounterConditionName>
)
