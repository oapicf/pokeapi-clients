package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokeathlonStatDetailAffectingNaturesDecreaseInner
import org.openapitools.server.api.model.PokeathlonStatDetailAffectingNaturesIncreaseInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeathlonStatDetailAffectingNatures(
    val decrease: kotlin.collections.List<PokeathlonStatDetailAffectingNaturesDecreaseInner>,
    val increase: kotlin.collections.List<PokeathlonStatDetailAffectingNaturesIncreaseInner>
)
