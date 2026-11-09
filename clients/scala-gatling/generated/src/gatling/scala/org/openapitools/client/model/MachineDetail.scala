
package org.openapitools.client.model


case class MachineDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The TM or HM item that corresponds to this machine. */
    _item: ItemSummary,
    /* The version group that this machine applies to. */
    _versionGroup: VersionGroupSummary,
    /* The move that is taught by this machine. */
    _move: MoveSummary
)
object MachineDetail {
    def toStringBody(var_id: Object, var_item: Object, var_versionGroup: Object, var_move: Object) =
        s"""
        | {
        | "id":$var_id,"item":$var_item,"versionGroup":$var_versionGroup,"move":$var_move
        | }
        """.stripMargin
}
