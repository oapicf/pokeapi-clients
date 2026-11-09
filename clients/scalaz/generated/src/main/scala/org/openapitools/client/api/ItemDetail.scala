package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemDetail._

case class ItemDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The power of the move Fling when used with this item. */
  flingPower: Option[Integer],
/* The effect of the move Fling when used with this item. */
  flingEffect: ItemFlingEffectSummary,
/* A list of attributes this item has. */
  attributes: List[ItemAttributeSummary],
/* The category of items this item falls into. */
  category: ItemCategorySummary,
/* The effect of this ability listed in different languages. */
  effectEntries: List[ItemEffectText],
/* The flavor text of this ability listed in different languages. */
  flavorTextEntries: List[ItemFlavorText],
/* A list of game indices relevent to this item by generation. */
  gameIndices: List[ItemGameIndex],
/* Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. */
  prices: List[ItemPrice],
/* The name of this item listed in different languages. */
  names: List[ItemName],
/* A list of Pokémon that might be found in the wild holding this item. */
  heldByPokemon: List[PokemonHeldItem],
/* A set of sprites used to depict this item in the game. */
  sprites: ItemSprites,
/* An evolution chain this item requires to produce a bay during mating. */
  babyTriggerFor: EvolutionChainSummary,
/* A list of the machines related to this item. */
  machines: List[ItemMachine])

object ItemDetail {
  import DateTimeCodecs._

  implicit val ItemDetailCodecJson: CodecJson[ItemDetail] = CodecJson.derive[ItemDetail]
  implicit val ItemDetailDecoder: EntityDecoder[ItemDetail] = jsonOf[ItemDetail]
  implicit val ItemDetailEncoder: EntityEncoder[ItemDetail] = jsonEncoderOf[ItemDetail]
}
