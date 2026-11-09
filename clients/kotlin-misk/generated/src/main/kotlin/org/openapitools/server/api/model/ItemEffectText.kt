package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemEffectText(
    /** The localized effect text for an API resource in a specific language. */
    val effect: kotlin.String,
    /** The localized effect text in brief. */
    val shortEffect: kotlin.String,
    /** The language this effect is in. */
    val language: LanguageSummary
)
