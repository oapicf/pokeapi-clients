package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonShapeAwesomeName
import org.openapitools.server.api.model.PokemonShapeName
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonShapeDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages. */
    val awesomeNames: kotlin.collections.List<PokemonShapeAwesomeName>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<PokemonShapeName>,
    /** A list of the Pokémon species that have this shape. */
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
