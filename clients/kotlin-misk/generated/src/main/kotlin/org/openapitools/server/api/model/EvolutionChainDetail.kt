package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionChainDetailChain
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainDetail(
    val id: kotlin.Int,
    val babyTriggerItem: ItemSummary,
    val chain: EvolutionChainDetailChain
)
