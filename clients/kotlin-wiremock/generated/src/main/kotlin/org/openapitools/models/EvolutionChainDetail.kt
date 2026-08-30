@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionChainDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("baby_trigger_item")
    val babyTriggerItem: ItemSummary,

    @field:JsonProperty("chain")
    val chain: EvolutionChainDetailChain,

)
