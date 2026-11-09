
package org.openapitools.client.model


case class MoveStatChange (
    /* The maximum amount of change to the referenced stat. */
    _change: Integer,
    /* The move causing the change. */
    _move: MoveSummary
)
object MoveStatChange {
    def toStringBody(var_change: Object, var_move: Object) =
        s"""
        | {
        | "change":$var_change,"move":$var_move
        | }
        """.stripMargin
}
