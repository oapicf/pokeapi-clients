package org.openapitools.server.api.model

import org.openapitools.server.api.model.Experience
import org.openapitools.server.api.model.GrowthRateDescription
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GrowthRateDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The formula used to calculate the rate at which the Pokémon species gains level. */
    val formula: kotlin.String,
    /** The descriptions of this characteristic listed in different languages. */
    val descriptions: kotlin.collections.List<GrowthRateDescription>,
    /** A list of levels and the amount of experienced needed to atain them based on this growth rate. */
    val levels: kotlin.collections.List<Experience>,
    /** A list of Pokémon species that gain levels at this growth rate. */
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
