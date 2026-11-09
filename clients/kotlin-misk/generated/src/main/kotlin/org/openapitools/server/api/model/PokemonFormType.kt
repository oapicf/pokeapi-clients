package org.openapitools.server.api.model

import org.openapitools.server.api.model.TypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonFormType(
    /** The order the Pokémon&#39;s types are listed in. */
    val slot: kotlin.Int,
    /** The type the referenced Form has. */
    val type: TypeSummary
)
