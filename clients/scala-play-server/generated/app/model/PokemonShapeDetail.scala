package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonShapeDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

