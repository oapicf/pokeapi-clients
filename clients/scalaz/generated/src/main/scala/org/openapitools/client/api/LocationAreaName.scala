package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaName._

case class LocationAreaName (
  name: String,
language: LanguageSummary)

object LocationAreaName {
  import DateTimeCodecs._

  implicit val LocationAreaNameCodecJson: CodecJson[LocationAreaName] = CodecJson.derive[LocationAreaName]
  implicit val LocationAreaNameDecoder: EntityDecoder[LocationAreaName] = jsonOf[LocationAreaName]
  implicit val LocationAreaNameEncoder: EntityEncoder[LocationAreaName] = jsonEncoderOf[LocationAreaName]
}
