package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilitySummary
import org.openapitools.model.GenerationName
import org.openapitools.model.MoveSummary
import org.openapitools.model.PokemonSpeciesSummary
import org.openapitools.model.RegionSummary
import org.openapitools.model.TypeSummary
import org.openapitools.model.VersionGroupSummary
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
 * @param abilities 
 * @param mainRegion 
 * @param moves 
 * @param names 
 * @param pokemonSpecies 
 * @param types 
 * @param versionGroups 
 */
data class GenerationDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("abilities")
    @get:JsonProperty("abilities", required = true) val abilities: kotlin.collections.List<AbilitySummary>,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("main_region")
    @get:JsonProperty("main_region", required = true) val mainRegion: RegionSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("moves")
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<MoveSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<GenerationName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("pokemon_species")
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("types")
    @get:JsonProperty("types", required = true) val types: kotlin.collections.List<TypeSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("version_groups")
    @get:JsonProperty("version_groups", required = true) val versionGroups: kotlin.collections.List<VersionGroupSummary>
) {

}

