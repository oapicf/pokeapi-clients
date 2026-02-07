package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemAttributeName._

case class ItemAttributeName (
  name: String,
language: LanguageSummary)

object ItemAttributeName {
  import DateTimeCodecs._

  implicit val ItemAttributeNameCodecJson: CodecJson[ItemAttributeName] = CodecJson.derive[ItemAttributeName]
  implicit val ItemAttributeNameDecoder: EntityDecoder[ItemAttributeName] = jsonOf[ItemAttributeName]
  implicit val ItemAttributeNameEncoder: EntityEncoder[ItemAttributeName] = jsonEncoderOf[ItemAttributeName]
}
