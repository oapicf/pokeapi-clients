
package org.openapitools.client.model


case class VersionDetail (
    _id: Integer,
    _name: String,
    _names: List[VersionName],
    _versionGroup: VersionGroupSummary
)
object VersionDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_versionGroup: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
