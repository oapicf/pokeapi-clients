
package org.openapitools.client.model


case class PokemonMoveVersionGroup (
    /* The minimum level to learn the move. */
    _levelLearnedAt: Integer,
    /* The method by which the move is learned. */
    _moveLearnMethod: MoveLearnMethodSummary,
    /* The version group in which the move is learned. */
    _versionGroup: VersionGroupSummary,
    /* Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. */
    _order: Option[Integer]
)
object PokemonMoveVersionGroup {
    def toStringBody(var_levelLearnedAt: Object, var_moveLearnMethod: Object, var_versionGroup: Object, var_order: Object) =
        s"""
        | {
        | "levelLearnedAt":$var_levelLearnedAt,"moveLearnMethod":$var_moveLearnMethod,"versionGroup":$var_versionGroup,"order":$var_order
        | }
        """.stripMargin
}
