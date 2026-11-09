package org.openapitools.server.api.model

import org.openapitools.server.api.model.EggGroupName
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EggGroupDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<EggGroupName>,
    /** A list of all Pokémon species that are members of this egg group. */
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
