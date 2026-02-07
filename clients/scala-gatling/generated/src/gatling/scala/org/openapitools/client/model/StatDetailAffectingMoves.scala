
package org.openapitools.client.model


case class StatDetailAffectingMoves (
    _increase: List[StatDetailAffectingMovesIncreaseInner],
    _decrease: List[StatDetailAffectingMovesIncreaseInner]
)
object StatDetailAffectingMoves {
    def toStringBody(var_increase: Object, var_decrease: Object) =
        s"""
        | {
        | "increase":$var_increase,"decrease":$var_decrease
        | }
        """.stripMargin
}
