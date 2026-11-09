package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenerationSummary
import org.openapitools.model.LocationSummary
import org.openapitools.model.PokedexSummary
import org.openapitools.model.RegionName
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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param locations A list of locations that can be found in this region.
 * @param mainGeneration The generation this region was introduced in.
 * @param names The name of this resource listed in different languages.
 * @param pokedexes A list of pokédexes that catalogue Pokémon in this region.
 * @param versionGroups A list of version groups where this region can be visited.
 */
data class RegionDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of locations that can be found in this region.")
    @param:JsonProperty("locations", required = true)
    @get:JsonProperty("locations", required = true) val locations: kotlin.collections.List<LocationSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The generation this region was introduced in.")
    @param:JsonProperty("main_generation", required = true)
    @get:JsonProperty("main_generation", required = true) val mainGeneration: GenerationSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<RegionName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of pokédexes that catalogue Pokémon in this region.")
    @param:JsonProperty("pokedexes", required = true)
    @get:JsonProperty("pokedexes", required = true) val pokedexes: kotlin.collections.List<PokedexSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of version groups where this region can be visited.")
    @param:JsonProperty("version_groups", required = true)
    @get:JsonProperty("version_groups", required = true) val versionGroups: kotlin.collections.List<VersionGroupSummary>
) {

}

