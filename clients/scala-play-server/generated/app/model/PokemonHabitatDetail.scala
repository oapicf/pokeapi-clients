package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonHabitatDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonHabitatDetail(
  id: Int,
  name: String,
  names: List[PokemonHabitatName],
  pokemonSpecies: List[PokemonSpeciesSummary]
)

object PokemonHabitatDetail {
  implicit lazy val pokemonHabitatDetailJsonFormat: Format[PokemonHabitatDetail] = Json.format[PokemonHabitatDetail]
}

