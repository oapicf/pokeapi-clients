
package org.openapitools.client.model


case class ItemPocketDetail (
    _id: Integer,
    _name: String,
    _categories: List[ItemCategorySummary],
    _names: List[ItemPocketName]
)
object ItemPocketDetail {
    def toStringBody(var_id: Object, var_name: Object, var_categories: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"categories":$var_categories,"names":$var_names
        | }
        """.stripMargin
}
