package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemFlingEffectDetail._

case class ItemFlingEffectDetail (
  id: Integer,
name: String,
effectEntries: List[ItemFlingEffectEffectText],
items: List[ItemSummary])

object ItemFlingEffectDetail {
  import DateTimeCodecs._

  implicit val ItemFlingEffectDetailCodecJson: CodecJson[ItemFlingEffectDetail] = CodecJson.derive[ItemFlingEffectDetail]
  implicit val ItemFlingEffectDetailDecoder: EntityDecoder[ItemFlingEffectDetail] = jsonOf[ItemFlingEffectDetail]
  implicit val ItemFlingEffectDetailEncoder: EntityEncoder[ItemFlingEffectDetail] = jsonEncoderOf[ItemFlingEffectDetail]
}
