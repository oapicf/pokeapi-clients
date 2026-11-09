package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionChainLink
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. */
    val babyTriggerItem: ItemSummary,
    /** The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. */
    val chain: EvolutionChainLink
)
