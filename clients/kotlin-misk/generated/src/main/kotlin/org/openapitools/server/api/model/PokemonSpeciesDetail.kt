package org.openapitools.server.api.model

import org.openapitools.server.api.model.EggGroupSummary
import org.openapitools.server.api.model.EvolutionChainSummary
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.GrowthRateSummary
import org.openapitools.server.api.model.PokemonColorSummary
import org.openapitools.server.api.model.PokemonDexEntry
import org.openapitools.server.api.model.PokemonHabitatSummary
import org.openapitools.server.api.model.PokemonShapeSummary
import org.openapitools.server.api.model.PokemonSpeciesDescription
import org.openapitools.server.api.model.PokemonSpeciesFlavorText
import org.openapitools.server.api.model.PokemonSpeciesGenus
import org.openapitools.server.api.model.PokemonSpeciesName
import org.openapitools.server.api.model.PokemonSpeciesPalParkEncounter
import org.openapitools.server.api.model.PokemonSpeciesSummary
import org.openapitools.server.api.model.PokemonSpeciesVariety
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The rate at which this Pokémon species gains levels. */
    val growthRate: GrowthRateSummary,
    /** A list of Pokedexes and the indexes reserved within them for this Pokémon species. */
    val pokedexNumbers: kotlin.collections.List<PokemonDexEntry>,
    /** A list of egg groups this Pokémon species is a member of. */
    val eggGroups: kotlin.collections.List<EggGroupSummary>,
    /** The color of this Pokémon for Pokédex search. */
    val color: PokemonColorSummary,
    /** The shape of this Pokémon for Pokédex search. */
    val shape: PokemonShapeSummary,
    /** The Pokémon species that evolves into this Pokemon_species. */
    val evolvesFromSpecies: PokemonSpeciesSummary,
    /** The evolution chain this Pokémon species is a member of. */
    val evolutionChain: EvolutionChainSummary,
    /** The habitat this Pokémon species can be encountered in. */
    val habitat: PokemonHabitatSummary,
    /** The generation this Pokémon species was introduced in. */
    val generation: GenerationSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<PokemonSpeciesName>,
    /** A list of encounters that can be had with this Pokémon species in pal park. */
    val palParkEncounters: kotlin.collections.List<PokemonSpeciesPalParkEncounter>,
    /** Descriptions of different forms Pokémon take on within the Pokémon species. */
    val formDescriptions: kotlin.collections.List<PokemonSpeciesDescription>,
    /** A list of flavor text entries for this Pokémon species. */
    val flavorTextEntries: kotlin.collections.List<PokemonSpeciesFlavorText>,
    /** The genus of this Pokémon species listed in multiple languages. */
    val genera: kotlin.collections.List<PokemonSpeciesGenus>,
    /** A list of the Pokémon that exist within this Pokémon species. */
    val varieties: kotlin.collections.List<PokemonSpeciesVariety>,
    /** The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. */
    val order: kotlin.Int? = null,
    /** The chance of this Pokémon being female, in eighths; or -1 for genderless. */
    val genderRate: kotlin.Int? = null,
    /** The base capture rate; up to 255. The higher the number, the easier the catch. */
    val captureRate: kotlin.Int? = null,
    /** The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. */
    val baseHappiness: kotlin.Int? = null,
    /** Whether or not this is a baby Pokémon. */
    val isBaby: kotlin.Boolean? = null,
    /** Whether or not this is a legendary Pokémon. */
    val isLegendary: kotlin.Boolean? = null,
    /** Whether or not this is a mythical Pokémon. */
    val isMythical: kotlin.Boolean? = null,
    /** Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. */
    val hatchCounter: kotlin.Int? = null,
    /** Whether or not this Pokémon has visual gender differences. */
    val hasGenderDifferences: kotlin.Boolean? = null,
    /** Whether or not this Pokémon has multiple forms and can switch between them. */
    val formsSwitchable: kotlin.Boolean? = null
)
