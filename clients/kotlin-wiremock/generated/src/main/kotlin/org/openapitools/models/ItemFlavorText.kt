@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemFlavorText(
    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("language")
    val language: LanguageSummary,

)
