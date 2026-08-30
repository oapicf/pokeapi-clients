package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokeathlonStatDetailAffectingNatures
import org.openapitools.server.api.model.PokeathlonStatName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeathlonStatDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val affectingNatures: PokeathlonStatDetailAffectingNatures,
    val names: kotlin.collections.List<PokeathlonStatName>
)
