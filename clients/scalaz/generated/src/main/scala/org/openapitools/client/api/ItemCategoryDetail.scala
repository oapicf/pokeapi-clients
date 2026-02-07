package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemCategoryDetail._

case class ItemCategoryDetail (
  id: Integer,
name: String,
items: List[ItemSummary],
names: List[ItemCategoryName],
pocket: ItemPocketSummary)

object ItemCategoryDetail {
  import DateTimeCodecs._

  implicit val ItemCategoryDetailCodecJson: CodecJson[ItemCategoryDetail] = CodecJson.derive[ItemCategoryDetail]
  implicit val ItemCategoryDetailDecoder: EntityDecoder[ItemCategoryDetail] = jsonOf[ItemCategoryDetail]
  implicit val ItemCategoryDetailEncoder: EntityEncoder[ItemCategoryDetail] = jsonEncoderOf[ItemCategoryDetail]
}
