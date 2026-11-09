package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
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
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpeciesDetail(
  id: Int,
  name: String,
  order: Option[Int],
  genderRate: Option[Int],
  captureRate: Option[Int],
  baseHappiness: Option[Int],
  isBaby: Option[Boolean],
  isLegendary: Option[Boolean],
  isMythical: Option[Boolean],
  hatchCounter: Option[Int],
  hasGenderDifferences: Option[Boolean],
  formsSwitchable: Option[Boolean],
  growthRate: GrowthRateSummary,
  pokedexNumbers: List[PokemonDexEntry],
  eggGroups: List[EggGroupSummary],
  color: PokemonColorSummary,
  shape: PokemonShapeSummary,
  evolvesFromSpecies: PokemonSpeciesSummary,
  evolutionChain: EvolutionChainSummary,
  habitat: PokemonHabitatSummary,
  generation: GenerationSummary,
  names: List[PokemonSpeciesName],
  palParkEncounters: List[PokemonSpeciesPalParkEncounter],
  formDescriptions: List[PokemonSpeciesDescription],
  flavorTextEntries: List[PokemonSpeciesFlavorText],
  genera: List[PokemonSpeciesGenus],
  varieties: List[PokemonSpeciesVariety]
)

object PokemonSpeciesDetail {
  implicit lazy val pokemonSpeciesDetailJsonFormat: Format[PokemonSpeciesDetail] = Json.format[PokemonSpeciesDetail]
}

