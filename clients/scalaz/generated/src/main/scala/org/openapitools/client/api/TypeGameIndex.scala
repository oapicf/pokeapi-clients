package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypeGameIndex._

case class TypeGameIndex (
  /* The internal id of an API resource within game data. */
  gameIndex: Integer,
/* The generation relevent to this game index. */
  generation: GenerationSummary)

object TypeGameIndex {
  import DateTimeCodecs._

  implicit val TypeGameIndexCodecJson: CodecJson[TypeGameIndex] = CodecJson.derive[TypeGameIndex]
  implicit val TypeGameIndexDecoder: EntityDecoder[TypeGameIndex] = jsonOf[TypeGameIndex]
  implicit val TypeGameIndexEncoder: EntityEncoder[TypeGameIndex] = jsonEncoderOf[TypeGameIndex]
}
