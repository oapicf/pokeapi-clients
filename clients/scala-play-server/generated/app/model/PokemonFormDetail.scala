package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonFormDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonFormDetail(
  id: Int,
  name: String,
  order: Option[Int],
  formOrder: Option[Int],
  isDefault: Option[Boolean],
  isBattleOnly: Option[Boolean],
  isMega: Option[Boolean],
  formName: String,
  pokemon: PokemonSummary,
  sprites: PokemonFormDetailSprites,
  versionGroup: VersionGroupSummary,
  formNames: List[PokemonFormDetailFormNamesInner],
  names: List[PokemonFormDetailFormNamesInner],
  types: List[PokemonDetailTypesInner]
)

object PokemonFormDetail {
  implicit lazy val pokemonFormDetailJsonFormat: Format[PokemonFormDetail] = Json.format[PokemonFormDetail]
}

