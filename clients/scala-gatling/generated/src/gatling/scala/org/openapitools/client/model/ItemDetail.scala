
package org.openapitools.client.model


case class ItemDetail (
    _id: Integer,
    _name: String,
    _cost: Option[Integer],
    _flingPower: Option[Integer],
    _flingEffect: ItemFlingEffectSummary,
    _attributes: List[AbilityDetailPokemonInnerPokemon],
    _category: ItemCategorySummary,
    _effectEntries: List[ItemEffectText],
    _flavorTextEntries: List[ItemFlavorText],
    _gameIndices: List[ItemGameIndex],
    _names: List[ItemName],
    _heldByPokemon: List[ItemDetailHeldByPokemonInner],
    _sprites: ItemDetailSprites,
    _babyTriggerFor: ItemDetailBabyTriggerFor,
    _machines: List[ItemDetailMachinesInner]
)
object ItemDetail {
    def toStringBody(var_id: Object, var_name: Object, var_cost: Object, var_flingPower: Object, var_flingEffect: Object, var_attributes: Object, var_category: Object, var_effectEntries: Object, var_flavorTextEntries: Object, var_gameIndices: Object, var_names: Object, var_heldByPokemon: Object, var_sprites: Object, var_babyTriggerFor: Object, var_machines: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"cost":$var_cost,"flingPower":$var_flingPower,"flingEffect":$var_flingEffect,"attributes":$var_attributes,"category":$var_category,"effectEntries":$var_effectEntries,"flavorTextEntries":$var_flavorTextEntries,"gameIndices":$var_gameIndices,"names":$var_names,"heldByPokemon":$var_heldByPokemon,"sprites":$var_sprites,"babyTriggerFor":$var_babyTriggerFor,"machines":$var_machines
        | }
        """.stripMargin
}
