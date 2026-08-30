package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonHabitatName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonHabitatName(
  name: String,
  language: LanguageSummary
)

object PokemonHabitatName {
  implicit lazy val pokemonHabitatNameJsonFormat: Format[PokemonHabitatName] = Json.format[PokemonHabitatName]
}

