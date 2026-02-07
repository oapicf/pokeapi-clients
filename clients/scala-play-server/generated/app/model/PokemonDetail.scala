package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonDetail(
  id: Int,
  name: String,
  baseExperience: Option[Int],
  height: Option[Int],
  isDefault: Option[Boolean],
  order: Option[Int],
  weight: Option[Int],
  abilities: List[PokemonDetailAbilitiesInner],
  pastAbilities: List[PokemonDetailPastAbilitiesInner],
  forms: List[PokemonFormSummary],
  gameIndices: List[PokemonGameIndex],
  heldItems: PokemonDetailHeldItems,
  locationAreaEncounters: String,
  moves: List[PokemonDetailMovesInner],
  species: PokemonSpeciesSummary,
  sprites: PokemonDetailSprites,
  cries: PokemonDetailCries,
  stats: List[PokemonStat],
  types: List[PokemonDetailTypesInner],
  pastTypes: List[PokemonDetailPastTypesInner]
)

object PokemonDetail {
  implicit lazy val pokemonDetailJsonFormat: Format[PokemonDetail] = Json.format[PokemonDetail]
}

