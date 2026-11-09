package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemName._

case class ItemName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object ItemName {
  import DateTimeCodecs._

  implicit val ItemNameCodecJson: CodecJson[ItemName] = CodecJson.derive[ItemName]
  implicit val ItemNameDecoder: EntityDecoder[ItemName] = jsonOf[ItemName]
  implicit val ItemNameEncoder: EntityEncoder[ItemName] = jsonEncoderOf[ItemName]
}
