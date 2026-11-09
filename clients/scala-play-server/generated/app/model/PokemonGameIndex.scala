package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonGameIndex.
  * @param gameIndex The internal id of an API resource within game data.
  * @param version The version relevent to this game index.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonGameIndex(
  gameIndex: Int,
  version: VersionSummary
)

object PokemonGameIndex {
  implicit lazy val pokemonGameIndexJsonFormat: Format[PokemonGameIndex] = Json.format[PokemonGameIndex]
}

