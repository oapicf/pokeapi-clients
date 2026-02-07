package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
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
 * @param encounterDetails 
 * @param maxChance 
 * @param version 
 */
data class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("encounter_details", required = true) val encounterDetails: kotlin.collections.List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner>,

    @Schema(example = "100", required = true, description = "")
    @get:JsonProperty("max_chance", required = true) val maxChance: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version", required = true) val version: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
) {

}

