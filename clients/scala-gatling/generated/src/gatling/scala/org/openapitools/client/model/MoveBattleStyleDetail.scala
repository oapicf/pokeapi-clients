
package org.openapitools.client.model


case class MoveBattleStyleDetail (
    _id: Integer,
    _name: String,
    _names: List[MoveBattleStyleName]
)
object MoveBattleStyleDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names
        | }
        """.stripMargin
}
