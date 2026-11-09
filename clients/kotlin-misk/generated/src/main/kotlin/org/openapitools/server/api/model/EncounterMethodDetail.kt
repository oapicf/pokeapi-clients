package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterMethodName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterMethodDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<EncounterMethodName>,
    /** A good value for sorting. */
    val order: kotlin.Int? = null
)
