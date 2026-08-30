package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesDescription(
    val language: LanguageSummary,
    val description: kotlin.String? = null
)
