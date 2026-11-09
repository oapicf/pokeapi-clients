package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonAbility
import org.openapitools.model.PokemonCries
import org.openapitools.model.PokemonFormSummary
import org.openapitools.model.PokemonGameIndex
import org.openapitools.model.PokemonHeldItemSummary
import org.openapitools.model.PokemonMove
import org.openapitools.model.PokemonPastAbility
import org.openapitools.model.PokemonPastStat
import org.openapitools.model.PokemonPastType
import org.openapitools.model.PokemonSpeciesSummary
import org.openapitools.model.PokemonSprites
import org.openapitools.model.PokemonStat
import org.openapitools.model.PokemonType
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
 * @param abilities A list of abilities this Pokémon could potentially have.
 * @param pastAbilities A list of details showing abilities this pokémon had in previous generations
 * @param forms A list of forms this Pokémon can take on.
 * @param gameIndices A list of game indices relevent to Pokémon item by generation.
 * @param heldItems A list of items this Pokémon may be holding when encountered.
 * @param locationAreaEncounters A link to a list of location areas, as well as encounter details pertaining to specific versions.
 * @param moves A list of moves along with learn methods and level details pertaining to specific version groups.
 * @param species The species this Pokémon belongs to.
 * @param sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
 * @param cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
 * @param stats A list of base stat values for this Pokémon.
 * @param pastStats A list of details showing stats this pokémon had in previous generations
 * @param types A list of details showing types this Pokémon has.
 * @param pastTypes A list of details showing types this pokémon had in previous generations
 * @param baseExperience The base experience gained for defeating this Pokémon.
 * @param height The height of this Pokémon in decimetres.
 * @param isDefault Set for exactly one Pokémon used as the default for each species.
 * @param order Order for sorting. Almost national order, except families are grouped together.
 * @param weight The weight of this Pokémon in hectograms.
 */
data class PokemonDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of abilities this Pokémon could potentially have.")
    @param:JsonProperty("abilities", required = true)
    @get:JsonProperty("abilities", required = true) val abilities: kotlin.collections.List<PokemonAbility>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details showing abilities this pokémon had in previous generations")
    @param:JsonProperty("past_abilities", required = true)
    @get:JsonProperty("past_abilities", required = true) val pastAbilities: kotlin.collections.List<PokemonPastAbility>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of forms this Pokémon can take on.")
    @param:JsonProperty("forms", required = true)
    @get:JsonProperty("forms", required = true) val forms: kotlin.collections.List<PokemonFormSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of game indices relevent to Pokémon item by generation.")
    @param:JsonProperty("game_indices", required = true)
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<PokemonGameIndex>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of items this Pokémon may be holding when encountered.")
    @param:JsonProperty("held_items", required = true)
    @get:JsonProperty("held_items", required = true) val heldItems: kotlin.collections.List<PokemonHeldItemSummary>,

    @Schema(required = true, readOnly = true, description = "A link to a list of location areas, as well as encounter details pertaining to specific versions.")
    @param:JsonProperty("location_area_encounters", required = true)
    @get:JsonProperty("location_area_encounters", required = true) val locationAreaEncounters: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of moves along with learn methods and level details pertaining to specific version groups.")
    @param:JsonProperty("moves", required = true)
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<PokemonMove>,

    @field:Valid
    @Schema(required = true, description = "The species this Pokémon belongs to.")
    @param:JsonProperty("species", required = true)
    @get:JsonProperty("species", required = true) val species: PokemonSpeciesSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>")
    @param:JsonProperty("sprites", required = true)
    @get:JsonProperty("sprites", required = true) val sprites: PokemonSprites,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>")
    @param:JsonProperty("cries", required = true)
    @get:JsonProperty("cries", required = true) val cries: PokemonCries,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of base stat values for this Pokémon.")
    @param:JsonProperty("stats", required = true)
    @get:JsonProperty("stats", required = true) val stats: kotlin.collections.List<PokemonStat>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details showing stats this pokémon had in previous generations")
    @param:JsonProperty("past_stats", required = true)
    @get:JsonProperty("past_stats", required = true) val pastStats: kotlin.collections.List<PokemonPastStat>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details showing types this Pokémon has.")
    @param:JsonProperty("types", required = true)
    @get:JsonProperty("types", required = true) val types: kotlin.collections.List<PokemonType>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details showing types this pokémon had in previous generations")
    @param:JsonProperty("past_types", required = true)
    @get:JsonProperty("past_types", required = true) val pastTypes: kotlin.collections.List<PokemonPastType>,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The base experience gained for defeating this Pokémon.")
    @param:JsonProperty("base_experience")
    @get:JsonProperty("base_experience") val baseExperience: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The height of this Pokémon in decimetres.")
    @param:JsonProperty("height")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(description = "Set for exactly one Pokémon used as the default for each species.")
    @param:JsonProperty("is_default")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Order for sorting. Almost national order, except families are grouped together.")
    @param:JsonProperty("order")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The weight of this Pokémon in hectograms.")
    @param:JsonProperty("weight")
    @get:JsonProperty("weight") val weight: kotlin.Int? = null
) {

}

