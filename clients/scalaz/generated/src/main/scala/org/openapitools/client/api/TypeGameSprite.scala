package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeGameSprite._

case class TypeGameSprite (
  /* The URL of the icon displaying the type name in this game, or null if unavailable. */
  nameIcon: Option[String],
/* The URL of the type symbol icon in this game, or null if unavailable. */
  symbolIcon: Option[String])

object TypeGameSprite {
  import DateTimeCodecs._

  implicit val TypeGameSpriteCodecJson: CodecJson[TypeGameSprite] = CodecJson.derive[TypeGameSprite]
  implicit val TypeGameSpriteDecoder: EntityDecoder[TypeGameSprite] = jsonOf[TypeGameSprite]
  implicit val TypeGameSpriteEncoder: EntityEncoder[TypeGameSprite] = jsonEncoderOf[TypeGameSprite]
}
