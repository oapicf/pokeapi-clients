package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonGameIndex(
    /** The internal id of an API resource within game data. */
    val gameIndex: kotlin.Int,
    /** The version relevent to this game index. */
    val version: VersionSummary
)
