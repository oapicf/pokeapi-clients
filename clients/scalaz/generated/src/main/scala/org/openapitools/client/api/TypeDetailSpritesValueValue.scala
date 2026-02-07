package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import TypeDetailSpritesValueValue._

case class TypeDetailSpritesValueValue (
  nameIcon: Option[URI])

object TypeDetailSpritesValueValue {
  import DateTimeCodecs._

  implicit val TypeDetailSpritesValueValueCodecJson: CodecJson[TypeDetailSpritesValueValue] = CodecJson.derive[TypeDetailSpritesValueValue]
  implicit val TypeDetailSpritesValueValueDecoder: EntityDecoder[TypeDetailSpritesValueValue] = jsonOf[TypeDetailSpritesValueValue]
  implicit val TypeDetailSpritesValueValueEncoder: EntityEncoder[TypeDetailSpritesValueValue] = jsonEncoderOf[TypeDetailSpritesValueValue]
}
