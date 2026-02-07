package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemCategoryName._

case class ItemCategoryName (
  name: String,
language: LanguageSummary)

object ItemCategoryName {
  import DateTimeCodecs._

  implicit val ItemCategoryNameCodecJson: CodecJson[ItemCategoryName] = CodecJson.derive[ItemCategoryName]
  implicit val ItemCategoryNameDecoder: EntityDecoder[ItemCategoryName] = jsonOf[ItemCategoryName]
  implicit val ItemCategoryNameEncoder: EntityEncoder[ItemCategoryName] = jsonEncoderOf[ItemCategoryName]
}
