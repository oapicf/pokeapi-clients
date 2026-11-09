package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokeathlonStatAffectingNature
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeathlonStatAffectingNatures(
    /** A list of natures and how they change the referenced Pokéathlon stat. */
    val increase: kotlin.collections.List<PokeathlonStatAffectingNature>,
    /** A list of natures and how they change the referenced Pokéathlon stat. */
    val decrease: kotlin.collections.List<PokeathlonStatAffectingNature>
)
