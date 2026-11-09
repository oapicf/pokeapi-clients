
package org.openapitools.client.model


case class MoveComboUsage (
    /* A list of moves to use before this move. */
    _useBefore: List[MoveSummary],
    /* A list of moves to use after this move. */
    _useAfter: List[MoveSummary]
)
object MoveComboUsage {
    def toStringBody(var_useBefore: Object, var_useAfter: Object) =
        s"""
        | {
        | "useBefore":$var_useBefore,"useAfter":$var_useAfter
        | }
        """.stripMargin
}
