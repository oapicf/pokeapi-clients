package org.openapitools.server.api.model

import org.openapitools.server.api.model.CharacteristicDescription
import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacteristicDetail(
    val id: kotlin.Int,
    val geneModulo: kotlin.Int,
    val possibleValues: kotlin.collections.List<kotlin.Int>,
    val highestStat: StatSummary,
    val descriptions: kotlin.collections.List<CharacteristicDescription>
)
