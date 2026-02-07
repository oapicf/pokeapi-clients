package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemPocketDetail._

case class ItemPocketDetail (
  id: Integer,
name: String,
categories: List[ItemCategorySummary],
names: List[ItemPocketName])

object ItemPocketDetail {
  import DateTimeCodecs._

  implicit val ItemPocketDetailCodecJson: CodecJson[ItemPocketDetail] = CodecJson.derive[ItemPocketDetail]
  implicit val ItemPocketDetailDecoder: EntityDecoder[ItemPocketDetail] = jsonOf[ItemPocketDetail]
  implicit val ItemPocketDetailEncoder: EntityEncoder[ItemPocketDetail] = jsonEncoderOf[ItemPocketDetail]
}
