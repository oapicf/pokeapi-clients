package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemGameIndex._

case class ItemGameIndex (
  gameIndex: Integer,
generation: GenerationSummary)

object ItemGameIndex {
  import DateTimeCodecs._

  implicit val ItemGameIndexCodecJson: CodecJson[ItemGameIndex] = CodecJson.derive[ItemGameIndex]
  implicit val ItemGameIndexDecoder: EntityDecoder[ItemGameIndex] = jsonOf[ItemGameIndex]
  implicit val ItemGameIndexEncoder: EntityEncoder[ItemGameIndex] = jsonEncoderOf[ItemGameIndex]
}
