
package org.openapitools.client.model


case class ItemFlingEffectDetail (
    _id: Integer,
    _name: String,
    _effectEntries: List[ItemFlingEffectEffectText],
    _items: List[ItemSummary]
)
object ItemFlingEffectDetail {
    def toStringBody(var_id: Object, var_name: Object, var_effectEntries: Object, var_items: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"effectEntries":$var_effectEntries,"items":$var_items
        | }
        """.stripMargin
}
