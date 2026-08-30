package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EggGroupDetailPokemonSpeciesInner(
    /** Pokemon species name. */
    val name: kotlin.String? = null,
    /** The URL to get more information about the species */
    val url: java.net.URI? = null
)
