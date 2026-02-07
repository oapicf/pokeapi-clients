package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.EvolutionChainSummary
import org.openapitools.model.GenerationSummary
import org.openapitools.model.GrowthRateSummary
import org.openapitools.model.PokemonColorSummary
import org.openapitools.model.PokemonDexEntry
import org.openapitools.model.PokemonFormDetailFormNamesInner
import org.openapitools.model.PokemonHabitatSummary
import org.openapitools.model.PokemonShapeSummary
import org.openapitools.model.PokemonSpeciesDescription
import org.openapitools.model.PokemonSpeciesDetailGeneraInner
import org.openapitools.model.PokemonSpeciesDetailPalParkEncountersInner
import org.openapitools.model.PokemonSpeciesDetailVarietiesInner
import org.openapitools.model.PokemonSpeciesFlavorText
import org.openapitools.model.PokemonSpeciesSummary
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
 * @param growthRate 
 * @param pokedexNumbers 
 * @param eggGroups 
 * @param color 
 * @param shape 
 * @param evolvesFromSpecies 
 * @param evolutionChain 
 * @param habitat 
 * @param generation 
 * @param names 
 * @param palParkEncounters 
 * @param formDescriptions 
 * @param flavorTextEntries 
 * @param genera 
 * @param varieties 
 * @param order 
 * @param genderRate 
 * @param captureRate 
 * @param baseHappiness 
 * @param isBaby 
 * @param isLegendary 
 * @param isMythical 
 * @param hatchCounter 
 * @param hasGenderDifferences 
 * @param formsSwitchable 
 */
data class PokemonSpeciesDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("growth_rate", required = true) val growthRate: GrowthRateSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokedex_numbers", required = true) val pokedexNumbers: kotlin.collections.List<PokemonDexEntry>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("egg_groups", required = true) val eggGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("color", required = true) val color: PokemonColorSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("shape", required = true) val shape: PokemonShapeSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("evolves_from_species", required = true) val evolvesFromSpecies: PokemonSpeciesSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("evolution_chain", required = true) val evolutionChain: EvolutionChainSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("habitat", required = true) val habitat: PokemonHabitatSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonFormDetailFormNamesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pal_park_encounters", required = true) val palParkEncounters: kotlin.collections.List<PokemonSpeciesDetailPalParkEncountersInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("form_descriptions", required = true) val formDescriptions: kotlin.collections.List<PokemonSpeciesDescription>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<PokemonSpeciesFlavorText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("genera", required = true) val genera: kotlin.collections.List<PokemonSpeciesDetailGeneraInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("varieties", required = true) val varieties: kotlin.collections.List<PokemonSpeciesDetailVarietiesInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender_rate") val genderRate: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("capture_rate") val captureRate: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("base_happiness") val baseHappiness: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_baby") val isBaby: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_legendary") val isLegendary: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_mythical") val isMythical: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hatch_counter") val hatchCounter: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("has_gender_differences") val hasGenderDifferences: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("forms_switchable") val formsSwitchable: kotlin.Boolean? = null
) {

}

