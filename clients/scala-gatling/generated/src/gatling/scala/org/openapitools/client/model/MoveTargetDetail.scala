
package org.openapitools.client.model


case class MoveTargetDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The description of this resource listed in different languages. */
    _descriptions: List[MoveTargetDescription],
    /* A list of moves that that are directed at this target. */
    _moves: List[MoveSummary],
    /* The name of this resource listed in different languages. */
    _names: List[MoveTargetName]
)
object MoveTargetDetail {
    def toStringBody(var_id: Object, var_name: Object, var_descriptions: Object, var_moves: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"descriptions":$var_descriptions,"moves":$var_moves,"names":$var_names
        | }
        """.stripMargin
}
