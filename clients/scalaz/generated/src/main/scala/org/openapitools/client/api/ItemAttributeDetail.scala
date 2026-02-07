package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemAttributeDetail._

case class ItemAttributeDetail (
  id: Integer,
name: String,
descriptions: List[ItemAttributeDescription],
items: List[AbilityDetailPokemonInnerPokemon],
names: List[ItemAttributeName])

object ItemAttributeDetail {
  import DateTimeCodecs._

  implicit val ItemAttributeDetailCodecJson: CodecJson[ItemAttributeDetail] = CodecJson.derive[ItemAttributeDetail]
  implicit val ItemAttributeDetailDecoder: EntityDecoder[ItemAttributeDetail] = jsonOf[ItemAttributeDetail]
  implicit val ItemAttributeDetailEncoder: EntityEncoder[ItemAttributeDetail] = jsonEncoderOf[ItemAttributeDetail]
}
