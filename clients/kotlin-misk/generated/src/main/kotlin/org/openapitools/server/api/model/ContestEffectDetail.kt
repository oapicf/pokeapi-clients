package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContestEffectEffectText
import org.openapitools.server.api.model.ContestEffectFlavorText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestEffectDetail(
    val id: kotlin.Int,
    val appeal: kotlin.Int,
    val jam: kotlin.Int,
    val effectEntries: kotlin.collections.List<ContestEffectEffectText>,
    val flavorTextEntries: kotlin.collections.List<ContestEffectFlavorText>
)
