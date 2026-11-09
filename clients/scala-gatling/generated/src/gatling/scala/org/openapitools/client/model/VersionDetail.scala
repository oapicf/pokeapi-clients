
package org.openapitools.client.model


case class VersionDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The name of this resource listed in different languages. */
    _names: List[VersionName],
    /* The version group this version belongs to. */
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
