package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemAttributeDetail._

case class ItemAttributeDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The description of this item attribute listed in different languages. */
  descriptions: List[ItemAttributeDescription],
/* A list of items that have this attribute. */
  items: List[ItemSummary],
/* The name of this item attribute listed in different languages. */
  names: List[ItemAttributeName])

object ItemAttributeDetail {
  import DateTimeCodecs._

  implicit val ItemAttributeDetailCodecJson: CodecJson[ItemAttributeDetail] = CodecJson.derive[ItemAttributeDetail]
  implicit val ItemAttributeDetailDecoder: EntityDecoder[ItemAttributeDetail] = jsonOf[ItemAttributeDetail]
  implicit val ItemAttributeDetailEncoder: EntityEncoder[ItemAttributeDetail] = jsonEncoderOf[ItemAttributeDetail]
}
