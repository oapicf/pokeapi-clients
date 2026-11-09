
package org.openapitools.client.model


case class CurrencyDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The name of this resource listed in different languages. */
    _names: List[CurrencyName]
)
object CurrencyDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names
        | }
        """.stripMargin
}
