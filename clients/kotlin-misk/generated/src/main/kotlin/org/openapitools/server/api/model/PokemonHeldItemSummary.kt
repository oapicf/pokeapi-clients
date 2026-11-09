package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.PokemonHeldItemVersion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonHeldItemSummary(
    /** The item the referenced Pokémon holds. */
    val item: ItemSummary,
    /** The details of the different versions in which the item is held. */
    val versionDetails: kotlin.collections.List<PokemonHeldItemVersion>
)
