package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonColorName
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonColorDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<PokemonColorName>,
    /** A list of the Pokémon species that have this color. */
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
