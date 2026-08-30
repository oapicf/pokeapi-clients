package org.openapitools.server.api.model

import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonGameIndex(
    val gameIndex: kotlin.Int,
    val version: VersionSummary
)
