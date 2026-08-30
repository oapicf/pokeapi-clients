package org.openapitools.server.api.model

import org.openapitools.server.api.model.CharacteristicSummary
import org.openapitools.server.api.model.MoveDamageClassSummary
import org.openapitools.server.api.model.StatDetailAffectingMoves
import org.openapitools.server.api.model.StatDetailAffectingNatures
import org.openapitools.server.api.model.StatName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val gameIndex: kotlin.Int,
    val affectingMoves: StatDetailAffectingMoves,
    val affectingNatures: StatDetailAffectingNatures,
    val characteristics: kotlin.collections.List<CharacteristicSummary>,
    val moveDamageClass: MoveDamageClassSummary,
    val names: kotlin.collections.List<StatName>,
    val isBattleOnly: kotlin.Boolean? = null
)
