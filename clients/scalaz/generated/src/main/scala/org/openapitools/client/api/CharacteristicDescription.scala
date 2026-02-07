package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CharacteristicDescription._

case class CharacteristicDescription (
  description: Option[String],
language: LanguageSummary)

object CharacteristicDescription {
  import DateTimeCodecs._

  implicit val CharacteristicDescriptionCodecJson: CodecJson[CharacteristicDescription] = CodecJson.derive[CharacteristicDescription]
  implicit val CharacteristicDescriptionDecoder: EntityDecoder[CharacteristicDescription] = jsonOf[CharacteristicDescription]
  implicit val CharacteristicDescriptionEncoder: EntityEncoder[CharacteristicDescription] = jsonEncoderOf[CharacteristicDescription]
}
