package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionTriggerName
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionTriggerDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<EvolutionTriggerName>,
    /** A list of pokemon species that result from this evolution trigger. */
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
