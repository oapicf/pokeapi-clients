
package org.openapitools.client.model


case class ItemCategoryDetail (
    _id: Integer,
    _name: String,
    _items: List[ItemSummary],
    _names: List[ItemCategoryName],
    _pocket: ItemPocketSummary
)
object ItemCategoryDetail {
    def toStringBody(var_id: Object, var_name: Object, var_items: Object, var_names: Object, var_pocket: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"items":$var_items,"names":$var_names,"pocket":$var_pocket
        | }
        """.stripMargin
}
