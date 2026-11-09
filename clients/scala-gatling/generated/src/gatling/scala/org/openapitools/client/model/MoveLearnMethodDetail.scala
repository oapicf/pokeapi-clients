
package org.openapitools.client.model


case class MoveLearnMethodDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The name of this resource listed in different languages. */
    _names: List[MoveLearnMethodName],
    /* The description of this resource listed in different languages. */
    _descriptions: List[MoveLearnMethodDescription],
    /* A list of version groups where moves can be learned through this method. */
    _versionGroups: List[VersionGroupSummary]
)
object MoveLearnMethodDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_descriptions: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"descriptions":$var_descriptions,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
