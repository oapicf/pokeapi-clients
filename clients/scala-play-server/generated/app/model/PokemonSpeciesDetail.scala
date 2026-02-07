package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

