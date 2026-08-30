package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterMethodName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterMethodDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<EncounterMethodName>,
    val order: kotlin.Int? = null
)
