package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  eggGroups: List[AbilityDetailPokemonInnerPokemon],
  color: PokemonColorSummary,
  shape: PokemonShapeSummary,
  evolvesFromSpecies: PokemonSpeciesSummary,
  evolutionChain: EvolutionChainSummary,
  habitat: PokemonHabitatSummary,
  generation: GenerationSummary,
  names: List[PokemonFormDetailFormNamesInner],
  palParkEncounters: List[PokemonSpeciesDetailPalParkEncountersInner],
  formDescriptions: List[PokemonSpeciesDescription],
  flavorTextEntries: List[PokemonSpeciesFlavorText],
  genera: List[PokemonSpeciesDetailGeneraInner],
  varieties: List[PokemonSpeciesDetailVarietiesInner]
)

object PokemonSpeciesDetail {
  implicit lazy val pokemonSpeciesDetailJsonFormat: Format[PokemonSpeciesDetail] = Json.format[PokemonSpeciesDetail]
}

