package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.GenerationSummary
import org.openapitools.model.LocationSummary
import org.openapitools.model.PokedexSummary
import org.openapitools.model.RegionName
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
 * @param name 
 * @param locations 
 * @param mainGeneration 
 * @param names 
 * @param pokedexes 
 * @param versionGroups 
 */
data class RegionDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("locations", required = true) val locations: kotlin.collections.List<LocationSummary>,

    @field:Valid
    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("main_generation", required = true) val mainGeneration: GenerationSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<RegionName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokedexes", required = true) val pokedexes: kotlin.collections.List<PokedexSummary>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_groups", required = true) val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
) {

}

