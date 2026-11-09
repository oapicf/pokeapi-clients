package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EggGroupSummary
import org.openapitools.model.EvolutionChainSummary
import org.openapitools.model.GenerationSummary
import org.openapitools.model.GrowthRateSummary
import org.openapitools.model.PokemonColorSummary
import org.openapitools.model.PokemonDexEntry
import org.openapitools.model.PokemonHabitatSummary
import org.openapitools.model.PokemonShapeSummary
import org.openapitools.model.PokemonSpeciesDescription
import org.openapitools.model.PokemonSpeciesFlavorText
import org.openapitools.model.PokemonSpeciesGenus
import org.openapitools.model.PokemonSpeciesName
import org.openapitools.model.PokemonSpeciesPalParkEncounter
import org.openapitools.model.PokemonSpeciesSummary
import org.openapitools.model.PokemonSpeciesVariety
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
 * @param growthRate The rate at which this Pokémon species gains levels.
 * @param pokedexNumbers A list of Pokedexes and the indexes reserved within them for this Pokémon species.
 * @param eggGroups A list of egg groups this Pokémon species is a member of.
 * @param color The color of this Pokémon for Pokédex search.
 * @param shape The shape of this Pokémon for Pokédex search.
 * @param evolvesFromSpecies The Pokémon species that evolves into this Pokemon_species.
 * @param evolutionChain The evolution chain this Pokémon species is a member of.
 * @param habitat The habitat this Pokémon species can be encountered in.
 * @param generation The generation this Pokémon species was introduced in.
 * @param names The name of this resource listed in different languages.
 * @param palParkEncounters A list of encounters that can be had with this Pokémon species in pal park.
 * @param formDescriptions Descriptions of different forms Pokémon take on within the Pokémon species.
 * @param flavorTextEntries A list of flavor text entries for this Pokémon species.
 * @param genera The genus of this Pokémon species listed in multiple languages.
 * @param varieties A list of the Pokémon that exist within this Pokémon species.
 * @param order The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
 * @param genderRate The chance of this Pokémon being female, in eighths; or -1 for genderless.
 * @param captureRate The base capture rate; up to 255. The higher the number, the easier the catch.
 * @param baseHappiness The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
 * @param isBaby Whether or not this is a baby Pokémon.
 * @param isLegendary Whether or not this is a legendary Pokémon.
 * @param isMythical Whether or not this is a mythical Pokémon.
 * @param hatchCounter Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
 * @param hasGenderDifferences Whether or not this Pokémon has visual gender differences.
 * @param formsSwitchable Whether or not this Pokémon has multiple forms and can switch between them.
 */
data class PokemonSpeciesDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The rate at which this Pokémon species gains levels.")
    @param:JsonProperty("growth_rate", required = true)
    @get:JsonProperty("growth_rate", required = true) val growthRate: GrowthRateSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokedexes and the indexes reserved within them for this Pokémon species.")
    @param:JsonProperty("pokedex_numbers", required = true)
    @get:JsonProperty("pokedex_numbers", required = true) val pokedexNumbers: kotlin.collections.List<PokemonDexEntry>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of egg groups this Pokémon species is a member of.")
    @param:JsonProperty("egg_groups", required = true)
    @get:JsonProperty("egg_groups", required = true) val eggGroups: kotlin.collections.List<EggGroupSummary>,

    @field:Valid
    @Schema(required = true, description = "The color of this Pokémon for Pokédex search.")
    @param:JsonProperty("color", required = true)
    @get:JsonProperty("color", required = true) val color: PokemonColorSummary,

    @field:Valid
    @Schema(required = true, description = "The shape of this Pokémon for Pokédex search.")
    @param:JsonProperty("shape", required = true)
    @get:JsonProperty("shape", required = true) val shape: PokemonShapeSummary,

    @field:Valid
    @Schema(required = true, description = "The Pokémon species that evolves into this Pokemon_species.")
    @param:JsonProperty("evolves_from_species", required = true)
    @get:JsonProperty("evolves_from_species", required = true) val evolvesFromSpecies: PokemonSpeciesSummary?,

    @field:Valid
    @Schema(required = true, description = "The evolution chain this Pokémon species is a member of.")
    @param:JsonProperty("evolution_chain", required = true)
    @get:JsonProperty("evolution_chain", required = true) val evolutionChain: EvolutionChainSummary,

    @field:Valid
    @Schema(required = true, description = "The habitat this Pokémon species can be encountered in.")
    @param:JsonProperty("habitat", required = true)
    @get:JsonProperty("habitat", required = true) val habitat: PokemonHabitatSummary?,

    @field:Valid
    @Schema(required = true, description = "The generation this Pokémon species was introduced in.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonSpeciesName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of encounters that can be had with this Pokémon species in pal park.")
    @param:JsonProperty("pal_park_encounters", required = true)
    @get:JsonProperty("pal_park_encounters", required = true) val palParkEncounters: kotlin.collections.List<PokemonSpeciesPalParkEncounter>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Descriptions of different forms Pokémon take on within the Pokémon species.")
    @param:JsonProperty("form_descriptions", required = true)
    @get:JsonProperty("form_descriptions", required = true) val formDescriptions: kotlin.collections.List<PokemonSpeciesDescription>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of flavor text entries for this Pokémon species.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<PokemonSpeciesFlavorText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The genus of this Pokémon species listed in multiple languages.")
    @param:JsonProperty("genera", required = true)
    @get:JsonProperty("genera", required = true) val genera: kotlin.collections.List<PokemonSpeciesGenus>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of the Pokémon that exist within this Pokémon species.")
    @param:JsonProperty("varieties", required = true)
    @get:JsonProperty("varieties", required = true) val varieties: kotlin.collections.List<PokemonSpeciesVariety>,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.")
    @param:JsonProperty("order")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The chance of this Pokémon being female, in eighths; or -1 for genderless.")
    @param:JsonProperty("gender_rate")
    @get:JsonProperty("gender_rate") val genderRate: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The base capture rate; up to 255. The higher the number, the easier the catch.")
    @param:JsonProperty("capture_rate")
    @get:JsonProperty("capture_rate") val captureRate: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.")
    @param:JsonProperty("base_happiness")
    @get:JsonProperty("base_happiness") val baseHappiness: kotlin.Int? = null,

    @Schema(description = "Whether or not this is a baby Pokémon.")
    @param:JsonProperty("is_baby")
    @get:JsonProperty("is_baby") val isBaby: kotlin.Boolean? = null,

    @Schema(description = "Whether or not this is a legendary Pokémon.")
    @param:JsonProperty("is_legendary")
    @get:JsonProperty("is_legendary") val isLegendary: kotlin.Boolean? = null,

    @Schema(description = "Whether or not this is a mythical Pokémon.")
    @param:JsonProperty("is_mythical")
    @get:JsonProperty("is_mythical") val isMythical: kotlin.Boolean? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.")
    @param:JsonProperty("hatch_counter")
    @get:JsonProperty("hatch_counter") val hatchCounter: kotlin.Int? = null,

    @Schema(description = "Whether or not this Pokémon has visual gender differences.")
    @param:JsonProperty("has_gender_differences")
    @get:JsonProperty("has_gender_differences") val hasGenderDifferences: kotlin.Boolean? = null,

    @Schema(description = "Whether or not this Pokémon has multiple forms and can switch between them.")
    @param:JsonProperty("forms_switchable")
    @get:JsonProperty("forms_switchable") val formsSwitchable: kotlin.Boolean? = null
) {

}

