package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LanguageDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. */
    val iso639: kotlin.String,
    /** The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. */
    val iso3166: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<LanguageName>,
    /** Whether or not the games are published in this language. */
    val official: kotlin.Boolean? = null
)
