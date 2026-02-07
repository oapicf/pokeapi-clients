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
 * @param ailment 
 * @param category 
 * @param minHits 
 * @param maxHits 
 * @param minTurns 
 * @param maxTurns 
 * @param drain 
 * @param healing 
 * @param critRate 
 * @param ailmentChance 
 * @param flinchChance 
 * @param statChance 
 */
data class MoveMeta(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ailment", required = true) val ailment: MoveMetaAilmentSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("category", required = true) val category: MoveMetaCategorySummary,

    @Schema(example = "null", description = "")
    @get:JsonProperty("min_hits") val minHits: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("max_hits") val maxHits: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("min_turns") val minTurns: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("max_turns") val maxTurns: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("drain") val drain: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("healing") val healing: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("crit_rate") val critRate: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ailment_chance") val ailmentChance: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flinch_chance") val flinchChance: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("stat_chance") val statChance: kotlin.Int? = null
) {

}

