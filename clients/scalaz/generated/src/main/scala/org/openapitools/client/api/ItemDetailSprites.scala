package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemDetailSprites._

case class ItemDetailSprites (
  default: URI)

object ItemDetailSprites {
  import DateTimeCodecs._

  implicit val ItemDetailSpritesCodecJson: CodecJson[ItemDetailSprites] = CodecJson.derive[ItemDetailSprites]
  implicit val ItemDetailSpritesDecoder: EntityDecoder[ItemDetailSprites] = jsonOf[ItemDetailSprites]
  implicit val ItemDetailSpritesEncoder: EntityEncoder[ItemDetailSprites] = jsonEncoderOf[ItemDetailSprites]
}
