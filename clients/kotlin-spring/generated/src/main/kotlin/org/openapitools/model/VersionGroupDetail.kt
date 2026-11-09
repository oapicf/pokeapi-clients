package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenerationSummary
import org.openapitools.model.MoveLearnMethodSummary
import org.openapitools.model.PokedexSummary
import org.openapitools.model.RegionSummary
import org.openapitools.model.VersionSummary
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
 * @param generation The generation this version was introduced in.
 * @param moveLearnMethods A list of methods in which Pokémon can learn moves in this version group.
 * @param pokedexes A list of Pokédexes introduces in this version group.
 * @param regions A list of regions that can be visited in this version group.
 * @param versions The versions this version group owns.
 * @param order Order for sorting. Almost by date of release, except similar versions are grouped together.
 */
data class VersionGroupDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The generation this version was introduced in.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of methods in which Pokémon can learn moves in this version group.")
    @param:JsonProperty("move_learn_methods", required = true)
    @get:JsonProperty("move_learn_methods", required = true) val moveLearnMethods: kotlin.collections.List<MoveLearnMethodSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokédexes introduces in this version group.")
    @param:JsonProperty("pokedexes", required = true)
    @get:JsonProperty("pokedexes", required = true) val pokedexes: kotlin.collections.List<PokedexSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of regions that can be visited in this version group.")
    @param:JsonProperty("regions", required = true)
    @get:JsonProperty("regions", required = true) val regions: kotlin.collections.List<RegionSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The versions this version group owns.")
    @param:JsonProperty("versions", required = true)
    @get:JsonProperty("versions", required = true) val versions: kotlin.collections.List<VersionSummary>,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Order for sorting. Almost by date of release, except similar versions are grouped together.")
    @param:JsonProperty("order")
    @get:JsonProperty("order") val order: kotlin.Int? = null
) {

}

