package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveMetaAilmentSummary
import org.openapitools.model.MoveMetaCategorySummary
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param ailment The status ailment this move inflicts on its target.
 * @param category The category of move this move falls under, e.g. damage or ailment.
 * @param minHits The minimum number of times this move hits. Null if it always only hits once.
 * @param maxHits The maximum number of times this move hits. Null if it always only hits once.
 * @param minTurns The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @param maxTurns The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @param drain HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
 * @param healing The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
 * @param critRate Critical hit rate bonus.
 * @param ailmentChance The likelihood this attack will cause an ailment.
 * @param flinchChance The likelihood this attack will cause the target Pokémon to flinch.
 * @param statChance The likelihood this attack will cause a stat change in the target Pokémon.
 */
data class MoveMeta(

    @field:Valid
    @Schema(required = true, description = "The status ailment this move inflicts on its target.")
    @param:JsonProperty("ailment", required = true)
    @get:JsonProperty("ailment", required = true) val ailment: MoveMetaAilmentSummary,

    @field:Valid
    @Schema(required = true, description = "The category of move this move falls under, e.g. damage or ailment.")
    @param:JsonProperty("category", required = true)
    @get:JsonProperty("category", required = true) val category: MoveMetaCategorySummary,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum number of times this move hits. Null if it always only hits once.")
    @param:JsonProperty("min_hits")
    @get:JsonProperty("min_hits") val minHits: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The maximum number of times this move hits. Null if it always only hits once.")
    @param:JsonProperty("max_hits")
    @get:JsonProperty("max_hits") val maxHits: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.")
    @param:JsonProperty("min_turns")
    @get:JsonProperty("min_turns") val minTurns: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.")
    @param:JsonProperty("max_turns")
    @get:JsonProperty("max_turns") val maxTurns: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "HP drain (if positive) or Recoil damage (if negative), in percent of damage done.")
    @param:JsonProperty("drain")
    @get:JsonProperty("drain") val drain: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.")
    @param:JsonProperty("healing")
    @get:JsonProperty("healing") val healing: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Critical hit rate bonus.")
    @param:JsonProperty("crit_rate")
    @get:JsonProperty("crit_rate") val critRate: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The likelihood this attack will cause an ailment.")
    @param:JsonProperty("ailment_chance")
    @get:JsonProperty("ailment_chance") val ailmentChance: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The likelihood this attack will cause the target Pokémon to flinch.")
    @param:JsonProperty("flinch_chance")
    @get:JsonProperty("flinch_chance") val flinchChance: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The likelihood this attack will cause a stat change in the target Pokémon.")
    @param:JsonProperty("stat_chance")
    @get:JsonProperty("stat_chance") val statChance: kotlin.Int? = null
) {

}

