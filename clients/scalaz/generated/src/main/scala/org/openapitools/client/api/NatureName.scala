package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NatureName._

case class NatureName (
  name: String,
language: LanguageSummary)

object NatureName {
  import DateTimeCodecs._

  implicit val NatureNameCodecJson: CodecJson[NatureName] = CodecJson.derive[NatureName]
  implicit val NatureNameDecoder: EntityDecoder[NatureName] = jsonOf[NatureName]
  implicit val NatureNameEncoder: EntityEncoder[NatureName] = jsonEncoderOf[NatureName]
}
