package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokeathlonStatAffectingNature
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
 * @param increase A list of natures and how they change the referenced Pokéathlon stat.
 * @param decrease A list of natures and how they change the referenced Pokéathlon stat.
 */
data class PokeathlonStatAffectingNatures(

    @field:Valid
    @Schema(required = true, description = "A list of natures and how they change the referenced Pokéathlon stat.")
    @param:JsonProperty("increase", required = true)
    @get:JsonProperty("increase", required = true) val increase: kotlin.collections.List<PokeathlonStatAffectingNature>,

    @field:Valid
    @Schema(required = true, description = "A list of natures and how they change the referenced Pokéathlon stat.")
    @param:JsonProperty("decrease", required = true)
    @get:JsonProperty("decrease", required = true) val decrease: kotlin.collections.List<PokeathlonStatAffectingNature>
) {

}

