package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EvolutionChainDetailChain
import org.openapitools.model.ItemSummary
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
 * @param babyTriggerItem 
 * @param chain 
 */
data class EvolutionChainDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("baby_trigger_item")
    @get:JsonProperty("baby_trigger_item", required = true) val babyTriggerItem: ItemSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("chain")
    @get:JsonProperty("chain", required = true) val chain: EvolutionChainDetailChain
) {

}

