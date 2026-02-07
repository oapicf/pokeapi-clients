package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonColorDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonColorDetail(
  id: Int,
  name: String,
  names: List[PokemonColorName],
  pokemonSpecies: List[PokemonSpeciesSummary]
)

object PokemonColorDetail {
  implicit lazy val pokemonColorDetailJsonFormat: Format[PokemonColorDetail] = Json.format[PokemonColorDetail]
}

