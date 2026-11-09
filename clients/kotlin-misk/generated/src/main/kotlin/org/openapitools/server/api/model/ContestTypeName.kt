package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestTypeName(
    /** The name for this contest. */
    val name: kotlin.String,
    /** The color associated with this contest&#39;s name. */
    val color: kotlin.String,
    /** The language that this name is in. */
    val language: LanguageSummary
)
