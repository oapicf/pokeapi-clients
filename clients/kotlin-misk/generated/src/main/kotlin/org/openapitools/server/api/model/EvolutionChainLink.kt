package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonEvolution
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainLink(
    /** Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. */
    val isBaby: kotlin.Boolean,
    /** The Pokémon species at this point in the evolution chain. */
    val species: PokemonSpeciesSummary,
    /** All details regarding the specific details of the referenced Pokémon species evolution. */
    val evolutionDetails: kotlin.collections.List<PokemonEvolution>,
    /** A List of chain objects. */
    val evolvesTo: kotlin.collections.List<EvolutionChainLink>
)
