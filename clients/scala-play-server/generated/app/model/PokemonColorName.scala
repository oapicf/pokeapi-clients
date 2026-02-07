package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonColorName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonColorName(
  name: String,
  language: LanguageSummary
)

object PokemonColorName {
  implicit lazy val pokemonColorNameJsonFormat: Format[PokemonColorName] = Json.format[PokemonColorName]
}

