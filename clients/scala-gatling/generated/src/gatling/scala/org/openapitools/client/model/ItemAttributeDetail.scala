
package org.openapitools.client.model


case class ItemAttributeDetail (
    _id: Integer,
    _name: String,
    _descriptions: List[ItemAttributeDescription],
    _items: List[AbilityDetailPokemonInnerPokemon],
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
