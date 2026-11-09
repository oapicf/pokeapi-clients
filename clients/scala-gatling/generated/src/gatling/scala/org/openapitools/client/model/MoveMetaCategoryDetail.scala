
package org.openapitools.client.model


case class MoveMetaCategoryDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The description of this resource listed in different languages. */
    _descriptions: List[MoveMetaCategoryDescription],
    /* A list of moves that fall into this category. */
    _moves: List[MoveSummary]
)
object MoveMetaCategoryDetail {
    def toStringBody(var_id: Object, var_name: Object, var_descriptions: Object, var_moves: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"descriptions":$var_descriptions,"moves":$var_moves
        | }
        """.stripMargin
}
