
package org.openapitools.client.model


case class StatAffectingMoves (
    /* A list of moves and how they change the referenced stat. */
    _increase: List[MoveStatChange],
    /* A list of moves and how they change the referenced stat. */
    _decrease: List[MoveStatChange]
)
object StatAffectingMoves {
    def toStringBody(var_increase: Object, var_decrease: Object) =
        s"""
        | {
        | "increase":$var_increase,"decrease":$var_decrease
        | }
        """.stripMargin
}
