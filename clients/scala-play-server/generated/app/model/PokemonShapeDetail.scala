package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonShapeDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonShapeDetail(
  id: Int,
  name: String,
  awesomeNames: List[PokemonShapeDetailAwesomeNamesInner],
  names: List[PokemonShapeDetailNamesInner],
  pokemonSpecies: List[PokemonSpeciesSummary]
)

object PokemonShapeDetail {
  implicit lazy val pokemonShapeDetailJsonFormat: Format[PokemonShapeDetail] = Json.format[PokemonShapeDetail]
}

