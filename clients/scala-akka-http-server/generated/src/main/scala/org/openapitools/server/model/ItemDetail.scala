package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param flingPower The power of the move Fling when used with this item. for example: ''null''
 * @param flingEffect The effect of the move Fling when used with this item. for example: ''null''
 * @param attributes A list of attributes this item has. for example: ''null''
 * @param category The category of items this item falls into. for example: ''null''
 * @param effectEntries The effect of this ability listed in different languages. for example: ''null''
 * @param flavorTextEntries The flavor text of this ability listed in different languages. for example: ''null''
 * @param gameIndices A list of game indices relevent to this item by generation. for example: ''null''
 * @param prices Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. for example: ''null''
 * @param names The name of this item listed in different languages. for example: ''null''
 * @param heldByPokemon A list of Pokémon that might be found in the wild holding this item. for example: ''null''
 * @param sprites A set of sprites used to depict this item in the game. for example: ''null''
 * @param babyTriggerFor An evolution chain this item requires to produce a bay during mating. for example: ''null''
 * @param machines A list of the machines related to this item. for example: ''null''
*/
final case class ItemDetail (
  id: Int,
  name: String,
  flingPower: Option[Int] = None,
  flingEffect: ItemFlingEffectSummary,
  attributes: Seq[ItemAttributeSummary],
  category: ItemCategorySummary,
  effectEntries: Seq[ItemEffectText],
  flavorTextEntries: Seq[ItemFlavorText],
  gameIndices: Seq[ItemGameIndex],
  prices: Seq[ItemPrice],
  names: Seq[ItemName],
  heldByPokemon: Seq[PokemonHeldItem],
  sprites: ItemSprites,
  babyTriggerFor: EvolutionChainSummary,
  machines: Seq[ItemMachine]
)

