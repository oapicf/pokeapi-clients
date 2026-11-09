package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param order The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. for example: ''null''
 * @param genderRate The chance of this Pokémon being female, in eighths; or -1 for genderless. for example: ''null''
 * @param captureRate The base capture rate; up to 255. The higher the number, the easier the catch. for example: ''null''
 * @param baseHappiness The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. for example: ''null''
 * @param isBaby Whether or not this is a baby Pokémon. for example: ''null''
 * @param isLegendary Whether or not this is a legendary Pokémon. for example: ''null''
 * @param isMythical Whether or not this is a mythical Pokémon. for example: ''null''
 * @param hatchCounter Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. for example: ''null''
 * @param hasGenderDifferences Whether or not this Pokémon has visual gender differences. for example: ''null''
 * @param formsSwitchable Whether or not this Pokémon has multiple forms and can switch between them. for example: ''null''
 * @param growthRate The rate at which this Pokémon species gains levels. for example: ''null''
 * @param pokedexNumbers A list of Pokedexes and the indexes reserved within them for this Pokémon species. for example: ''null''
 * @param eggGroups A list of egg groups this Pokémon species is a member of. for example: ''null''
 * @param color The color of this Pokémon for Pokédex search. for example: ''null''
 * @param shape The shape of this Pokémon for Pokédex search. for example: ''null''
 * @param evolvesFromSpecies The Pokémon species that evolves into this Pokemon_species. for example: ''null''
 * @param evolutionChain The evolution chain this Pokémon species is a member of. for example: ''null''
 * @param habitat The habitat this Pokémon species can be encountered in. for example: ''null''
 * @param generation The generation this Pokémon species was introduced in. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param palParkEncounters A list of encounters that can be had with this Pokémon species in pal park. for example: ''null''
 * @param formDescriptions Descriptions of different forms Pokémon take on within the Pokémon species. for example: ''null''
 * @param flavorTextEntries A list of flavor text entries for this Pokémon species. for example: ''null''
 * @param genera The genus of this Pokémon species listed in multiple languages. for example: ''null''
 * @param varieties A list of the Pokémon that exist within this Pokémon species. for example: ''null''
*/
final case class PokemonSpeciesDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  genderRate: Option[Int] = None,
  captureRate: Option[Int] = None,
  baseHappiness: Option[Int] = None,
  isBaby: Option[Boolean] = None,
  isLegendary: Option[Boolean] = None,
  isMythical: Option[Boolean] = None,
  hatchCounter: Option[Int] = None,
  hasGenderDifferences: Option[Boolean] = None,
  formsSwitchable: Option[Boolean] = None,
  growthRate: GrowthRateSummary,
  pokedexNumbers: Seq[PokemonDexEntry],
  eggGroups: Seq[EggGroupSummary],
  color: PokemonColorSummary,
  shape: PokemonShapeSummary,
  evolvesFromSpecies: PokemonSpeciesSummary,
  evolutionChain: EvolutionChainSummary,
  habitat: PokemonHabitatSummary,
  generation: GenerationSummary,
  names: Seq[PokemonSpeciesName],
  palParkEncounters: Seq[PokemonSpeciesPalParkEncounter],
  formDescriptions: Seq[PokemonSpeciesDescription],
  flavorTextEntries: Seq[PokemonSpeciesFlavorText],
  genera: Seq[PokemonSpeciesGenus],
  varieties: Seq[PokemonSpeciesVariety]
)

