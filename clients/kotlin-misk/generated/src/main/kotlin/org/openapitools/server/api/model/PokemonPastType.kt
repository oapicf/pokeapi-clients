package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.PokemonType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonPastType(
    /** The last generation in which the referenced pokémon had the listed types. */
    val generation: GenerationSummary,
    /** The types the referenced pokémon had up to and including the listed generation. */
    val types: kotlin.collections.List<PokemonType>
)
