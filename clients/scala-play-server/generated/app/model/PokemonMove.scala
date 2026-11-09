package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonMove.
  * @param move The move the Pokémon can learn.
  * @param versionGroupDetails The details of the version in which the Pokémon can learn the move.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonMove(
  move: MoveSummary,
  versionGroupDetails: List[PokemonMoveVersionGroup]
)

object PokemonMove {
  implicit lazy val pokemonMoveJsonFormat: Format[PokemonMove] = Json.format[PokemonMove]
}

