package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegionName._

case class RegionName (
  name: String,
language: LanguageSummary)

object RegionName {
  import DateTimeCodecs._

  implicit val RegionNameCodecJson: CodecJson[RegionName] = CodecJson.derive[RegionName]
  implicit val RegionNameDecoder: EntityDecoder[RegionName] = jsonOf[RegionName]
  implicit val RegionNameEncoder: EntityEncoder[RegionName] = jsonEncoderOf[RegionName]
}
