
package org.openapitools.client.model


case class MoveDamageClassDetail (
    _id: Integer,
    _name: String,
    _descriptions: List[MoveDamageClassDescription],
    _moves: List[MoveSummary],
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
