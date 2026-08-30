package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestEffectFlavorText(
    val flavorText: kotlin.String,
    val language: LanguageSummary
)
