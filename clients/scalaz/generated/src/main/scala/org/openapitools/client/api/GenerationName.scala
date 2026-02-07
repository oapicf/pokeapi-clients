package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerationName._

case class GenerationName (
  name: String,
language: LanguageSummary)

object GenerationName {
  import DateTimeCodecs._

  implicit val GenerationNameCodecJson: CodecJson[GenerationName] = CodecJson.derive[GenerationName]
  implicit val GenerationNameDecoder: EntityDecoder[GenerationName] = jsonOf[GenerationName]
  implicit val GenerationNameEncoder: EntityEncoder[GenerationName] = jsonEncoderOf[GenerationName]
}
