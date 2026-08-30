@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("growth_rate")
    val growthRate: GrowthRateSummary,

    @field:JsonProperty("pokedex_numbers")
    val pokedexNumbers: kotlin.collections.List<PokemonDexEntry>,

    @field:JsonProperty("egg_groups")
    val eggGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("color")
    val color: PokemonColorSummary,

    @field:JsonProperty("shape")
    val shape: PokemonShapeSummary,

    @field:JsonProperty("evolves_from_species")
    val evolvesFromSpecies: PokemonSpeciesSummary,

    @field:JsonProperty("evolution_chain")
    val evolutionChain: EvolutionChainSummary,

    @field:JsonProperty("habitat")
    val habitat: PokemonHabitatSummary,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<PokemonFormDetailFormNamesInner>,

    @field:JsonProperty("pal_park_encounters")
    val palParkEncounters: kotlin.collections.List<PokemonSpeciesDetailPalParkEncountersInner>,

    @field:JsonProperty("form_descriptions")
    val formDescriptions: kotlin.collections.List<PokemonSpeciesDescription>,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<PokemonSpeciesFlavorText>,

    @field:JsonProperty("genera")
    val genera: kotlin.collections.List<PokemonSpeciesDetailGeneraInner>,

    @field:JsonProperty("varieties")
    val varieties: kotlin.collections.List<PokemonSpeciesDetailVarietiesInner>,

    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

    @field:JsonProperty("gender_rate")
    val genderRate: kotlin.Int? = null,

    @field:JsonProperty("capture_rate")
    val captureRate: kotlin.Int? = null,

    @field:JsonProperty("base_happiness")
    val baseHappiness: kotlin.Int? = null,

    @field:JsonProperty("is_baby")
    val isBaby: kotlin.Boolean? = null,

    @field:JsonProperty("is_legendary")
    val isLegendary: kotlin.Boolean? = null,

    @field:JsonProperty("is_mythical")
    val isMythical: kotlin.Boolean? = null,

    @field:JsonProperty("hatch_counter")
    val hatchCounter: kotlin.Int? = null,

    @field:JsonProperty("has_gender_differences")
    val hasGenderDifferences: kotlin.Boolean? = null,

    @field:JsonProperty("forms_switchable")
    val formsSwitchable: kotlin.Boolean? = null,

)
