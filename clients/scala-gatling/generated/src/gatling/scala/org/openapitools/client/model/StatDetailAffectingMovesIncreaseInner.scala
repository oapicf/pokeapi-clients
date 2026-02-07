
package org.openapitools.client.model


case class StatDetailAffectingMovesIncreaseInner (
    _change: Integer,
    _move: AbilityDetailPokemonInnerPokemon
)
object StatDetailAffectingMovesIncreaseInner {
    def toStringBody(var_change: Object, var_move: Object) =
        s"""
        | {
        | "change":$var_change,"move":$var_move
        | }
        """.stripMargin
}
