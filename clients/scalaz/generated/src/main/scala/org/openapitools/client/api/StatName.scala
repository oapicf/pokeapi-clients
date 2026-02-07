package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatName._

case class StatName (
  name: String,
language: LanguageSummary)

object StatName {
  import DateTimeCodecs._

  implicit val StatNameCodecJson: CodecJson[StatName] = CodecJson.derive[StatName]
  implicit val StatNameDecoder: EntityDecoder[StatName] = jsonOf[StatName]
  implicit val StatNameEncoder: EntityEncoder[StatName] = jsonEncoderOf[StatName]
}
