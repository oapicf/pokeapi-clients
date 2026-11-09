package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityFlavorText(
    /** The localized name for an API resource in a specific language. */
    val flavorText: kotlin.String,
    /** The language this text resource is in. */
    val language: LanguageSummary,
    /** The version group that uses this flavor text. */
    val versionGroup: VersionGroupSummary
)
