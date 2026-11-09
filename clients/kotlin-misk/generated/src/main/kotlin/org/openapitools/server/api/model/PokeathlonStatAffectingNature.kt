package org.openapitools.server.api.model

import org.openapitools.server.api.model.NatureSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeathlonStatAffectingNature(
    /** The maximum amount of change to the referenced Pokéathlon stat. */
    val maxChange: kotlin.Int,
    /** The nature causing the change. */
    val nature: NatureSummary
)
