package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonShapeDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param awesomeNames The \"scientific\" name of this Pokémon shape listed in different languages.
  * @param names The name of this resource listed in different languages.
  * @param pokemonSpecies A list of the Pokémon species that have this shape.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonShapeDetail(
  id: Int,
  name: String,
  awesomeNames: List[PokemonShapeAwesomeName],
  names: List[PokemonShapeName],
  pokemonSpecies: List[PokemonSpeciesSummary]
)

object PokemonShapeDetail {
  implicit lazy val pokemonShapeDetailJsonFormat: Format[PokemonShapeDetail] = Json.format[PokemonShapeDetail]
}

