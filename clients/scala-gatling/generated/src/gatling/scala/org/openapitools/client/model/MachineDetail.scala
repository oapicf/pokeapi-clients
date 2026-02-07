
package org.openapitools.client.model


case class MachineDetail (
    _id: Integer,
    _item: ItemSummary,
    _versionGroup: VersionGroupSummary,
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
