package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveMetaAilmentSummary
import org.openapitools.server.api.model.MoveMetaCategorySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMeta(
    /** The status ailment this move inflicts on its target. */
    val ailment: MoveMetaAilmentSummary,
    /** The category of move this move falls under, e.g. damage or ailment. */
    val category: MoveMetaCategorySummary,
    /** The minimum number of times this move hits. Null if it always only hits once. */
    val minHits: kotlin.Int? = null,
    /** The maximum number of times this move hits. Null if it always only hits once. */
    val maxHits: kotlin.Int? = null,
    /** The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. */
    val minTurns: kotlin.Int? = null,
    /** The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. */
    val maxTurns: kotlin.Int? = null,
    /** HP drain (if positive) or Recoil damage (if negative), in percent of damage done. */
    val drain: kotlin.Int? = null,
    /** The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. */
    val healing: kotlin.Int? = null,
    /** Critical hit rate bonus. */
    val critRate: kotlin.Int? = null,
    /** The likelihood this attack will cause an ailment. */
    val ailmentChance: kotlin.Int? = null,
    /** The likelihood this attack will cause the target Pokémon to flinch. */
    val flinchChance: kotlin.Int? = null,
    /** The likelihood this attack will cause a stat change in the target Pokémon. */
    val statChance: kotlin.Int? = null
)
