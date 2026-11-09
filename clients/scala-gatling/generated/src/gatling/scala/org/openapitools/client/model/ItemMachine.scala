
package org.openapitools.client.model


case class ItemMachine (
    /* The machine that teaches a move from an item. */
    _machine: MachineSummary,
    /* The version group of this specific machine. */
    _versionGroup: VersionGroupSummary
)
object ItemMachine {
    def toStringBody(var_machine: Object, var_versionGroup: Object) =
        s"""
        | {
        | "machine":$var_machine,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
