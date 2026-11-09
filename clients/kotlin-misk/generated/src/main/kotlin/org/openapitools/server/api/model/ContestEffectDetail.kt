package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContestEffectEffectText
import org.openapitools.server.api.model.ContestEffectFlavorText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestEffectDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The base number of hearts the user of this move gets. */
    val appeal: kotlin.Int,
    /** The base number of hearts the user&#39;s opponent loses. */
    val jam: kotlin.Int,
    /** The result of this contest effect listed in different languages. */
    val effectEntries: kotlin.collections.List<ContestEffectEffectText>,
    /** The flavor text of this contest effect listed in different languages. */
    val flavorTextEntries: kotlin.collections.List<ContestEffectFlavorText>
)
