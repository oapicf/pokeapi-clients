
package org.openapitools.client.model


case class MoveDamageClassDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The description of this resource listed in different languages. */
    _descriptions: List[MoveDamageClassDescription],
    /* A list of moves that fall into this damage class. */
    _moves: List[MoveSummary],
    /* The name of this resource listed in different languages. */
    _names: List[MoveDamageClassName]
)
object MoveDamageClassDetail {
    def toStringBody(var_id: Object, var_name: Object, var_descriptions: Object, var_moves: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"descriptions":$var_descriptions,"moves":$var_moves,"names":$var_names
        | }
        """.stripMargin
}
