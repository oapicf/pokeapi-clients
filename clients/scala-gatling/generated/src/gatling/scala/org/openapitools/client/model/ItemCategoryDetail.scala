
package org.openapitools.client.model


case class ItemCategoryDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of items that are a part of this category. */
    _items: List[ItemSummary],
    /* The name of this item category listed in different languages. */
    _names: List[ItemCategoryName],
    /* The pocket items in this category would be put in. */
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
