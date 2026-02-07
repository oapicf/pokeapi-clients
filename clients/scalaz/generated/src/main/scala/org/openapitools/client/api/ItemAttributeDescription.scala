package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemAttributeDescription._

case class ItemAttributeDescription (
  description: Option[String],
language: LanguageSummary)

object ItemAttributeDescription {
  import DateTimeCodecs._

  implicit val ItemAttributeDescriptionCodecJson: CodecJson[ItemAttributeDescription] = CodecJson.derive[ItemAttributeDescription]
  implicit val ItemAttributeDescriptionDecoder: EntityDecoder[ItemAttributeDescription] = jsonOf[ItemAttributeDescription]
  implicit val ItemAttributeDescriptionEncoder: EntityEncoder[ItemAttributeDescription] = jsonEncoderOf[ItemAttributeDescription]
}
