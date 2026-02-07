package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.PokedexDescription
import org.openapitools.model.PokedexDetailPokemonEntriesInner
import org.openapitools.model.PokedexName
import org.openapitools.model.RegionSummary
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
 * @param descriptions 
 * @param names 
 * @param pokemonEntries 
 * @param region 
 * @param versionGroups 
 * @param isMainSeries 
 */
data class PokedexDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<PokedexDescription>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokedexName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokemon_entries", required = true) val pokemonEntries: kotlin.collections.List<PokedexDetailPokemonEntriesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("region", required = true) val region: RegionSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_groups", required = true) val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_main_series") val isMainSeries: kotlin.Boolean? = null
) {

}

