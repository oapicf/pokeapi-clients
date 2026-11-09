package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemPocketDetail._

case class ItemPocketDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of item categories that are relevant to this item pocket. */
  categories: List[ItemCategorySummary],
/* The name of this resource listed in different languages. */
  names: List[ItemPocketName])

object ItemPocketDetail {
  import DateTimeCodecs._

  implicit val ItemPocketDetailCodecJson: CodecJson[ItemPocketDetail] = CodecJson.derive[ItemPocketDetail]
  implicit val ItemPocketDetailDecoder: EntityDecoder[ItemPocketDetail] = jsonOf[ItemPocketDetail]
  implicit val ItemPocketDetailEncoder: EntityEncoder[ItemPocketDetail] = jsonEncoderOf[ItemPocketDetail]
}
