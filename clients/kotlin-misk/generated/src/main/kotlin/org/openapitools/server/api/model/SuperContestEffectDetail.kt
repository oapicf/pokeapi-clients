package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.SuperContestEffectFlavorText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SuperContestEffectDetail(
    val id: kotlin.Int,
    val appeal: kotlin.Int,
    val flavorTextEntries: kotlin.collections.List<SuperContestEffectFlavorText>,
    val moves: kotlin.collections.List<MoveSummary>
)
