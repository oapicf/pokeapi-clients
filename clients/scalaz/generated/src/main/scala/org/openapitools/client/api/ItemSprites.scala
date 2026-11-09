package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemSprites._

case class ItemSprites (
  /* The default depiction of this item. */
  default: String)

object ItemSprites {
  import DateTimeCodecs._

  implicit val ItemSpritesCodecJson: CodecJson[ItemSprites] = CodecJson.derive[ItemSprites]
  implicit val ItemSpritesDecoder: EntityDecoder[ItemSprites] = jsonOf[ItemSprites]
  implicit val ItemSpritesEncoder: EntityEncoder[ItemSprites] = jsonEncoderOf[ItemSprites]
}
