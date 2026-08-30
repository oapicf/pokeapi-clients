package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityEffectText(
    val effect: kotlin.String,
    val shortEffect: kotlin.String,
    val language: LanguageSummary
)
