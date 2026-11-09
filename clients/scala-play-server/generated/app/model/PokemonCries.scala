package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonCries.
  * @param latest The latest depiction of this Pokémon's cry.
  * @param legacy The legacy depiction of this Pokémon's cry.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonCries(
  latest: String,
  legacy: String
)

object PokemonCries {
  implicit lazy val pokemonCriesJsonFormat: Format[PokemonCries] = Json.format[PokemonCries]
}

