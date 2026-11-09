
package org.openapitools.client.model


case class MoveMetaStatChange (
    /* The amount of change. */
    _change: Integer,
    /* The stat being affected. */
    _stat: StatSummary
)
object MoveMetaStatChange {
    def toStringBody(var_change: Object, var_stat: Object) =
        s"""
        | {
        | "change":$var_change,"stat":$var_stat
        | }
        """.stripMargin
}
