package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFlavorDetailBerriesInnerBerry(
    /** The name of the berry */
    val name: kotlin.String? = null,
    /** The URL to get more information about the berry */
    val url: java.net.URI? = null
)
