
package org.openapitools.client.model


case class ItemPocketDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of item categories that are relevant to this item pocket. */
    _categories: List[ItemCategorySummary],
    /* The name of this resource listed in different languages. */
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
