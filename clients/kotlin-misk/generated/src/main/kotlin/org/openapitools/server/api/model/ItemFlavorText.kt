package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemFlavorText(
    /** The localized flavor text for an API resource in a specific language. */
    val text: kotlin.String,
    /** The version group which uses this flavor text. */
    val versionGroup: VersionGroupSummary,
    /** The language this name is in. */
    val language: LanguageSummary
)
