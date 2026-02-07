package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemPocketName._

case class ItemPocketName (
  name: String,
language: LanguageSummary)

object ItemPocketName {
  import DateTimeCodecs._

  implicit val ItemPocketNameCodecJson: CodecJson[ItemPocketName] = CodecJson.derive[ItemPocketName]
  implicit val ItemPocketNameDecoder: EntityDecoder[ItemPocketName] = jsonOf[ItemPocketName]
  implicit val ItemPocketNameEncoder: EntityEncoder[ItemPocketName] = jsonEncoderOf[ItemPocketName]
}
