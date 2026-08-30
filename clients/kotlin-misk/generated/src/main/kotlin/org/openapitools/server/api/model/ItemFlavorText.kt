package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemFlavorText(
    val text: kotlin.String,
    val versionGroup: VersionGroupSummary,
    val language: LanguageSummary
)
