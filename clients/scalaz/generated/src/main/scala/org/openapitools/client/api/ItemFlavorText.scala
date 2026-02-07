package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemFlavorText._

case class ItemFlavorText (
  text: String,
versionGroup: VersionGroupSummary,
language: LanguageSummary)

object ItemFlavorText {
  import DateTimeCodecs._

  implicit val ItemFlavorTextCodecJson: CodecJson[ItemFlavorText] = CodecJson.derive[ItemFlavorText]
  implicit val ItemFlavorTextDecoder: EntityDecoder[ItemFlavorText] = jsonOf[ItemFlavorText]
  implicit val ItemFlavorTextEncoder: EntityEncoder[ItemFlavorText] = jsonEncoderOf[ItemFlavorText]
}
