package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonMoveVersionGroup.
  * @param levelLearnedAt The minimum level to learn the move.
  * @param moveLearnMethod The method by which the move is learned.
  * @param versionGroup The version group in which the move is learned.
  * @param order Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonMoveVersionGroup(
  levelLearnedAt: Int,
  moveLearnMethod: MoveLearnMethodSummary,
  versionGroup: VersionGroupSummary,
  order: Option[Int]
)

object PokemonMoveVersionGroup {
  implicit lazy val pokemonMoveVersionGroupJsonFormat: Format[PokemonMoveVersionGroup] = Json.format[PokemonMoveVersionGroup]
}

