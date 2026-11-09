package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilitySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonAbility(
    /** The slot this ability occupies in this Pokémon species. */
    val slot: kotlin.Int,
    /** The ability the Pokémon may have. */
    val ability: AbilitySummary,
    /** Whether or not this is a hidden ability. */
    val isHidden: kotlin.Boolean? = null
)
