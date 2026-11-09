package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.PokemonAbilityPast
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonPastAbility(
    /** The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. */
    val abilities: kotlin.collections.List<PokemonAbilityPast>,
    /** The last generation in which the referenced pokémon had the listed abilities. */
    val generation: GenerationSummary
)
