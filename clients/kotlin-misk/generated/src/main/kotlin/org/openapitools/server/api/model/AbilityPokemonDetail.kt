package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityPokemonDetail(
    /** Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. */
    val slot: kotlin.Int,
    /** The Pokémon this ability could belong to. */
    val pokemon: PokemonSummary,
    /** Whether or not this a hidden ability for the referenced Pokémon. */
    val isHidden: kotlin.Boolean? = null
)
