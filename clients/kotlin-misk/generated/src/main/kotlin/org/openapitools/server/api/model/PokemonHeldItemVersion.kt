package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonHeldItemVersion(
    /** How often the item is held. */
    val rarity: kotlin.Int,
    /** The version in which the item is held. */
    val version: VersionSummary
)
