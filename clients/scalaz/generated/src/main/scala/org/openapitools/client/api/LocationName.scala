package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationName._

case class LocationName (
  name: String,
language: LanguageSummary)

object LocationName {
  import DateTimeCodecs._

  implicit val LocationNameCodecJson: CodecJson[LocationName] = CodecJson.derive[LocationName]
  implicit val LocationNameDecoder: EntityDecoder[LocationName] = jsonOf[LocationName]
  implicit val LocationNameEncoder: EntityEncoder[LocationName] = jsonEncoderOf[LocationName]
}
