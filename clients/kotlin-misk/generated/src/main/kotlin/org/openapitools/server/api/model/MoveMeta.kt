package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveMetaAilmentSummary
import org.openapitools.server.api.model.MoveMetaCategorySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMeta(
    val ailment: MoveMetaAilmentSummary,
    val category: MoveMetaCategorySummary,
    val minHits: kotlin.Int? = null,
    val maxHits: kotlin.Int? = null,
    val minTurns: kotlin.Int? = null,
    val maxTurns: kotlin.Int? = null,
    val drain: kotlin.Int? = null,
    val healing: kotlin.Int? = null,
    val critRate: kotlin.Int? = null,
    val ailmentChance: kotlin.Int? = null,
    val flinchChance: kotlin.Int? = null,
    val statChance: kotlin.Int? = null
)
