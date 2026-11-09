package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokedexDescription
import org.openapitools.model.PokedexName
import org.openapitools.model.PokemonDexNumber
import org.openapitools.model.RegionSummary
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
 * @param descriptions The description of this resource listed in different languages.
 * @param names The name of this resource listed in different languages.
 * @param pokemonEntries A list of Pokémon catalogued in this Pokédex and their indexes.
 * @param region The region this Pokédex catalogues Pokémon for.
 * @param versionGroups A list of version groups this Pokédex is relevant to.
 * @param isMainSeries Whether or not this Pokédex originated in the main series of the video games.
 */
data class PokedexDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The description of this resource listed in different languages.")
    @param:JsonProperty("descriptions", required = true)
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<PokedexDescription>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokedexName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon catalogued in this Pokédex and their indexes.")
    @param:JsonProperty("pokemon_entries", required = true)
    @get:JsonProperty("pokemon_entries", required = true) val pokemonEntries: kotlin.collections.List<PokemonDexNumber>,

    @field:Valid
    @Schema(required = true, description = "The region this Pokédex catalogues Pokémon for.")
    @param:JsonProperty("region", required = true)
    @get:JsonProperty("region", required = true) val region: RegionSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of version groups this Pokédex is relevant to.")
    @param:JsonProperty("version_groups", required = true)
    @get:JsonProperty("version_groups", required = true) val versionGroups: kotlin.collections.List<VersionGroupSummary>,

    @Schema(description = "Whether or not this Pokédex originated in the main series of the video games.")
    @param:JsonProperty("is_main_series")
    @get:JsonProperty("is_main_series") val isMainSeries: kotlin.Boolean? = null
) {

}

