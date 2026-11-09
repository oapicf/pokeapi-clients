package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenderPokemonSpecies
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of Pokémon species that can be this gender and how likely it is that they will be. */
    val pokemonSpeciesDetails: kotlin.collections.List<GenderPokemonSpecies>,
    /** A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. */
    val requiredForEvolution: kotlin.collections.List<PokemonSpeciesSummary>
)
