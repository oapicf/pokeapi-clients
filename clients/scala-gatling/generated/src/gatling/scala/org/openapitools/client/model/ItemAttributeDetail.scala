
package org.openapitools.client.model


case class ItemAttributeDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The description of this item attribute listed in different languages. */
    _descriptions: List[ItemAttributeDescription],
    /* A list of items that have this attribute. */
    _items: List[ItemSummary],
    /* The name of this item attribute listed in different languages. */
    _names: List[ItemAttributeName]
)
object ItemAttributeDetail {
    def toStringBody(var_id: Object, var_name: Object, var_descriptions: Object, var_items: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"descriptions":$var_descriptions,"items":$var_items,"names":$var_names
        | }
        """.stripMargin
}
