package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.SuperContestEffectFlavorText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SuperContestEffectDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The level of appeal this super contest effect has. */
    val appeal: kotlin.Int,
    /** The flavor text of this super contest effect listed in different languages. */
    val flavorTextEntries: kotlin.collections.List<SuperContestEffectFlavorText>,
    /** A list of moves that have the effect when used in super contests. */
    val moves: kotlin.collections.List<MoveSummary>
)
