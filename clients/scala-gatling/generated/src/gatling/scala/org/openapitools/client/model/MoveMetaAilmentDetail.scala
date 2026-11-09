
package org.openapitools.client.model


case class MoveMetaAilmentDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of moves that cause this ailment. */
    _moves: List[MoveSummary],
    /* The name of this resource listed in different languages. */
    _names: List[MoveMetaAilmentName]
)
object MoveMetaAilmentDetail {
    def toStringBody(var_id: Object, var_name: Object, var_moves: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"moves":$var_moves,"names":$var_names
        | }
        """.stripMargin
}
