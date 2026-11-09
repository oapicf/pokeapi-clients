package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonShapeAwesomeName(
    /** The localized \&quot;scientific\&quot; name for an API resource in a specific language. */
    val awesomeName: kotlin.String,
    /** The language this \&quot;scientific\&quot; name is in. */
    val language: LanguageSummary
)
