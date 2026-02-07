package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param order  for example: ''null''
 * @param genderRate  for example: ''null''
 * @param captureRate  for example: ''null''
 * @param baseHappiness  for example: ''null''
 * @param isBaby  for example: ''null''
 * @param isLegendary  for example: ''null''
 * @param isMythical  for example: ''null''
 * @param hatchCounter  for example: ''null''
 * @param hasGenderDifferences  for example: ''null''
 * @param formsSwitchable  for example: ''null''
 * @param growthRate  for example: ''null''
 * @param pokedexNumbers  for example: ''null''
 * @param eggGroups  for example: ''null''
 * @param color  for example: ''null''
 * @param shape  for example: ''null''
 * @param evolvesFromSpecies  for example: ''null''
 * @param evolutionChain  for example: ''null''
 * @param habitat  for example: ''null''
 * @param generation  for example: ''null''
 * @param names  for example: ''null''
 * @param palParkEncounters  for example: ''null''
 * @param formDescriptions  for example: ''null''
 * @param flavorTextEntries  for example: ''null''
 * @param genera  for example: ''null''
 * @param varieties  for example: ''null''
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
  eggGroups: Seq[AbilityDetailPokemonInnerPokemon],
  color: PokemonColorSummary,
  shape: PokemonShapeSummary,
  evolvesFromSpecies: PokemonSpeciesSummary,
  evolutionChain: EvolutionChainSummary,
  habitat: PokemonHabitatSummary,
  generation: GenerationSummary,
  names: Seq[PokemonFormDetailFormNamesInner],
  palParkEncounters: Seq[PokemonSpeciesDetailPalParkEncountersInner],
  formDescriptions: Seq[PokemonSpeciesDescription],
  flavorTextEntries: Seq[PokemonSpeciesFlavorText],
  genera: Seq[PokemonSpeciesDetailGeneraInner],
  varieties: Seq[PokemonSpeciesDetailVarietiesInner]
)

