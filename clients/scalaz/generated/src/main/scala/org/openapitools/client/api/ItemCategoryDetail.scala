package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemCategoryDetail._

case class ItemCategoryDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of items that are a part of this category. */
  items: List[ItemSummary],
/* The name of this item category listed in different languages. */
  names: List[ItemCategoryName],
/* The pocket items in this category would be put in. */
  pocket: ItemPocketSummary)

object ItemCategoryDetail {
  import DateTimeCodecs._

  implicit val ItemCategoryDetailCodecJson: CodecJson[ItemCategoryDetail] = CodecJson.derive[ItemCategoryDetail]
  implicit val ItemCategoryDetailDecoder: EntityDecoder[ItemCategoryDetail] = jsonOf[ItemCategoryDetail]
  implicit val ItemCategoryDetailEncoder: EntityEncoder[ItemCategoryDetail] = jsonEncoderOf[ItemCategoryDetail]
}
