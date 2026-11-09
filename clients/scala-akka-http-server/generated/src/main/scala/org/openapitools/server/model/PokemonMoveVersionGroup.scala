package org.openapitools.server.model


/**
 * @param levelLearnedAt The minimum level to learn the move. for example: ''null''
 * @param moveLearnMethod The method by which the move is learned. for example: ''null''
 * @param versionGroup The version group in which the move is learned. for example: ''null''
 * @param order Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. for example: ''null''
*/
final case class PokemonMoveVersionGroup (
  levelLearnedAt: Int,
  moveLearnMethod: MoveLearnMethodSummary,
  versionGroup: VersionGroupSummary,
  order: Option[Int] = None
)

