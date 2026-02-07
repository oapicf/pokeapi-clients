package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationGameIndex._

case class LocationGameIndex (
  gameIndex: Integer,
generation: GenerationSummary)

object LocationGameIndex {
  import DateTimeCodecs._

  implicit val LocationGameIndexCodecJson: CodecJson[LocationGameIndex] = CodecJson.derive[LocationGameIndex]
  implicit val LocationGameIndexDecoder: EntityDecoder[LocationGameIndex] = jsonOf[LocationGameIndex]
  implicit val LocationGameIndexEncoder: EntityEncoder[LocationGameIndex] = jsonEncoderOf[LocationGameIndex]
}
