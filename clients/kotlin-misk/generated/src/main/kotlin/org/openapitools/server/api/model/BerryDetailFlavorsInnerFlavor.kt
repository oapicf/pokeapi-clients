package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryDetailFlavorsInnerFlavor(
    /** The name of the flavor */
    val name: kotlin.String? = null,
    /** The URL to get more information about the flavor */
    val url: java.net.URI? = null
)
