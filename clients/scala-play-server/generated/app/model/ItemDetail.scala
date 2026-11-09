package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param flingPower The power of the move Fling when used with this item.
  * @param flingEffect The effect of the move Fling when used with this item.
  * @param attributes A list of attributes this item has.
  * @param category The category of items this item falls into.
  * @param effectEntries The effect of this ability listed in different languages.
  * @param flavorTextEntries The flavor text of this ability listed in different languages.
  * @param gameIndices A list of game indices relevent to this item by generation.
  * @param prices Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
  * @param names The name of this item listed in different languages.
  * @param heldByPokemon A list of Pokémon that might be found in the wild holding this item.
  * @param sprites A set of sprites used to depict this item in the game.
  * @param babyTriggerFor An evolution chain this item requires to produce a bay during mating.
  * @param machines A list of the machines related to this item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemDetail(
  id: Int,
  name: String,
  flingPower: Option[Int],
  flingEffect: ItemFlingEffectSummary,
  attributes: List[ItemAttributeSummary],
  category: ItemCategorySummary,
  effectEntries: List[ItemEffectText],
  flavorTextEntries: List[ItemFlavorText],
  gameIndices: List[ItemGameIndex],
  prices: List[ItemPrice],
  names: List[ItemName],
  heldByPokemon: List[PokemonHeldItem],
  sprites: ItemSprites,
  babyTriggerFor: EvolutionChainSummary,
  machines: List[ItemMachine]
)

object ItemDetail {
  implicit lazy val itemDetailJsonFormat: Format[ItemDetail] = Json.format[ItemDetail]
}

