package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemAttributeName(
    /** The localized name for an API resource in a specific language. */
    val name: kotlin.String,
    /** The language this name is in. */
    val language: LanguageSummary
)
