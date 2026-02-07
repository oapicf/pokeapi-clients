package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemDetail._

case class ItemDetail (
  id: Integer,
name: String,
cost: Option[Integer],
flingPower: Option[Integer],
flingEffect: ItemFlingEffectSummary,
attributes: List[AbilityDetailPokemonInnerPokemon],
category: ItemCategorySummary,
effectEntries: List[ItemEffectText],
flavorTextEntries: List[ItemFlavorText],
gameIndices: List[ItemGameIndex],
names: List[ItemName],
heldByPokemon: List[ItemDetailHeldByPokemonInner],
sprites: ItemDetailSprites,
babyTriggerFor: ItemDetailBabyTriggerFor,
machines: List[ItemDetailMachinesInner])

object ItemDetail {
  import DateTimeCodecs._

  implicit val ItemDetailCodecJson: CodecJson[ItemDetail] = CodecJson.derive[ItemDetail]
  implicit val ItemDetailDecoder: EntityDecoder[ItemDetail] = jsonOf[ItemDetail]
  implicit val ItemDetailEncoder: EntityEncoder[ItemDetail] = jsonEncoderOf[ItemDetail]
}
