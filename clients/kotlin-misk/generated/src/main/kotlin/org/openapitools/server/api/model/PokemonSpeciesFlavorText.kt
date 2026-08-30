package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesFlavorText(
    val flavorText: kotlin.String,
    val language: LanguageSummary,
    val version: VersionSummary
)
