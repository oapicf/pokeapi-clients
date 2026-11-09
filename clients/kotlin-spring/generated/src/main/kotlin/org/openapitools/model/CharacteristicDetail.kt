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
 * @param id The identifier for this resource.
 * @param geneModulo The remainder of the highest stat/IV divided by 5.
 * @param possibleValues The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
 * @param highestStat The stat which results in this characteristic.
 * @param descriptions The descriptions of this characteristic listed in different languages.
 */
data class CharacteristicDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @Schema(required = true, description = "The remainder of the highest stat/IV divided by 5.")
    @param:JsonProperty("gene_modulo", required = true)
    @get:JsonProperty("gene_modulo", required = true) val geneModulo: kotlin.Int,

    @Schema(required = true, readOnly = true, description = "The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.")
    @param:JsonProperty("possible_values", required = true)
    @get:JsonProperty("possible_values", required = true) val possibleValues: kotlin.collections.List<kotlin.Int>,

    @field:Valid
    @Schema(required = true, description = "The stat which results in this characteristic.")
    @param:JsonProperty("highest_stat", required = true)
    @get:JsonProperty("highest_stat", required = true) val highestStat: StatSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The descriptions of this characteristic listed in different languages.")
    @param:JsonProperty("descriptions", required = true)
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<CharacteristicDescription>
) {

}

