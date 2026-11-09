package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemSummary
import org.openapitools.model.PokemonHeldItemVersion
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
 * @param item The item the referenced Pokémon holds.
 * @param versionDetails The details of the different versions in which the item is held.
 */
data class PokemonHeldItemSummary(

    @field:Valid
    @Schema(required = true, description = "The item the referenced Pokémon holds.")
    @param:JsonProperty("item", required = true)
    @get:JsonProperty("item", required = true) val item: ItemSummary,

    @field:Valid
    @Schema(required = true, description = "The details of the different versions in which the item is held.")
    @param:JsonProperty("version_details", required = true)
    @get:JsonProperty("version_details", required = true) val versionDetails: kotlin.collections.List<PokemonHeldItemVersion>
) {

}

