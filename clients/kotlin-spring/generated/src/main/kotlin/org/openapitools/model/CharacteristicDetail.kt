package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CharacteristicDescription
import org.openapitools.model.StatSummary
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
 * @param id 
 * @param geneModulo 
 * @param possibleValues 
 * @param highestStat 
 * @param descriptions 
 */
data class CharacteristicDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("gene_modulo")
    @get:JsonProperty("gene_modulo", required = true) val geneModulo: kotlin.Int,

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("possible_values")
    @get:JsonProperty("possible_values", required = true) val possibleValues: kotlin.collections.List<kotlin.Int>,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("highest_stat")
    @get:JsonProperty("highest_stat", required = true) val highestStat: StatSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("descriptions")
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<CharacteristicDescription>
) {

}

