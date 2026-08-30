package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveFlavorText(
    val flavorText: kotlin.String,
    val language: LanguageSummary,
    val versionGroup: VersionGroupSummary
)
