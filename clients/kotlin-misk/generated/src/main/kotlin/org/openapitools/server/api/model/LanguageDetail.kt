package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LanguageDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val iso639: kotlin.String,
    val iso3166: kotlin.String,
    val names: kotlin.collections.List<LanguageName>,
    val official: kotlin.Boolean? = null
)
