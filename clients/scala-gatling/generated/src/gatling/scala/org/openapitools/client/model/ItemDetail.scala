
package org.openapitools.client.model


case class ItemDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The power of the move Fling when used with this item. */
    _flingPower: Option[Integer],
    /* The effect of the move Fling when used with this item. */
    _flingEffect: ItemFlingEffectSummary,
    /* A list of attributes this item has. */
    _attributes: List[ItemAttributeSummary],
    /* The category of items this item falls into. */
    _category: ItemCategorySummary,
    /* The effect of this ability listed in different languages. */
    _effectEntries: List[ItemEffectText],
    /* The flavor text of this ability listed in different languages. */
    _flavorTextEntries: List[ItemFlavorText],
    /* A list of game indices relevent to this item by generation. */
    _gameIndices: List[ItemGameIndex],
    /* Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. */
    _prices: List[ItemPrice],
    /* The name of this item listed in different languages. */
    _names: List[ItemName],
    /* A list of Pokémon that might be found in the wild holding this item. */
    _heldByPokemon: List[PokemonHeldItem],
    /* A set of sprites used to depict this item in the game. */
    _sprites: ItemSprites,
    /* An evolution chain this item requires to produce a bay during mating. */
    _babyTriggerFor: EvolutionChainSummary,
    /* A list of the machines related to this item. */
    _machines: List[ItemMachine]
)
object ItemDetail {
    def toStringBody(var_id: Object, var_name: Object, var_flingPower: Object, var_flingEffect: Object, var_attributes: Object, var_category: Object, var_effectEntries: Object, var_flavorTextEntries: Object, var_gameIndices: Object, var_prices: Object, var_names: Object, var_heldByPokemon: Object, var_sprites: Object, var_babyTriggerFor: Object, var_machines: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"flingPower":$var_flingPower,"flingEffect":$var_flingEffect,"attributes":$var_attributes,"category":$var_category,"effectEntries":$var_effectEntries,"flavorTextEntries":$var_flavorTextEntries,"gameIndices":$var_gameIndices,"prices":$var_prices,"names":$var_names,"heldByPokemon":$var_heldByPokemon,"sprites":$var_sprites,"babyTriggerFor":$var_babyTriggerFor,"machines":$var_machines
        | }
        """.stripMargin
}
