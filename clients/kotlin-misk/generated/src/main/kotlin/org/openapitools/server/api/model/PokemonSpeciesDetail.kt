package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.EvolutionChainSummary
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.GrowthRateSummary
import org.openapitools.server.api.model.PokemonColorSummary
import org.openapitools.server.api.model.PokemonDexEntry
import org.openapitools.server.api.model.PokemonFormDetailFormNamesInner
import org.openapitools.server.api.model.PokemonHabitatSummary
import org.openapitools.server.api.model.PokemonShapeSummary
import org.openapitools.server.api.model.PokemonSpeciesDescription
import org.openapitools.server.api.model.PokemonSpeciesDetailGeneraInner
import org.openapitools.server.api.model.PokemonSpeciesDetailPalParkEncountersInner
import org.openapitools.server.api.model.PokemonSpeciesDetailVarietiesInner
import org.openapitools.server.api.model.PokemonSpeciesFlavorText
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val growthRate: GrowthRateSummary,
    val pokedexNumbers: kotlin.collections.List<PokemonDexEntry>,
    val eggGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val color: PokemonColorSummary,
    val shape: PokemonShapeSummary,
    val evolvesFromSpecies: PokemonSpeciesSummary,
    val evolutionChain: EvolutionChainSummary,
    val habitat: PokemonHabitatSummary,
    val generation: GenerationSummary,
    val names: kotlin.collections.List<PokemonFormDetailFormNamesInner>,
    val palParkEncounters: kotlin.collections.List<PokemonSpeciesDetailPalParkEncountersInner>,
    val formDescriptions: kotlin.collections.List<PokemonSpeciesDescription>,
    val flavorTextEntries: kotlin.collections.List<PokemonSpeciesFlavorText>,
    val genera: kotlin.collections.List<PokemonSpeciesDetailGeneraInner>,
    val varieties: kotlin.collections.List<PokemonSpeciesDetailVarietiesInner>,
    val order: kotlin.Int? = null,
    val genderRate: kotlin.Int? = null,
    val captureRate: kotlin.Int? = null,
    val baseHappiness: kotlin.Int? = null,
    val isBaby: kotlin.Boolean? = null,
    val isLegendary: kotlin.Boolean? = null,
    val isMythical: kotlin.Boolean? = null,
    val hatchCounter: kotlin.Int? = null,
    val hasGenderDifferences: kotlin.Boolean? = null,
    val formsSwitchable: kotlin.Boolean? = null
)
