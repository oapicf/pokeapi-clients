
package org.openapitools.client.model


case class MoveTargetDetail (
    _id: Integer,
    _name: String,
    _descriptions: List[MoveTargetDescription],
    _moves: List[MoveSummary],
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
