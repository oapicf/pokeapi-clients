package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonHabitatName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonHabitatName(
  name: String,
  language: LanguageSummary
)

object PokemonHabitatName {
  implicit lazy val pokemonHabitatNameJsonFormat: Format[PokemonHabitatName] = Json.format[PokemonHabitatName]
}

