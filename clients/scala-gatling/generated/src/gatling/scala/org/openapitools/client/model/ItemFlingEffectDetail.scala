
package org.openapitools.client.model


case class ItemFlingEffectDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The result of this fling effect listed in different languages. */
    _effectEntries: List[ItemFlingEffectEffectText],
    /* A list of items that have this fling effect. */
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
