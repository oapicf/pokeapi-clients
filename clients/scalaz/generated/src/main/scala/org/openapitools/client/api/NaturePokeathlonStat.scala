package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NaturePokeathlonStat._

case class NaturePokeathlonStat (
  /* The amount of change. */
  maxChange: Integer,
/* The stat being affected. */
  pokeathlonStat: PokeathlonStatSummary)

object NaturePokeathlonStat {
  import DateTimeCodecs._

  implicit val NaturePokeathlonStatCodecJson: CodecJson[NaturePokeathlonStat] = CodecJson.derive[NaturePokeathlonStat]
  implicit val NaturePokeathlonStatDecoder: EntityDecoder[NaturePokeathlonStat] = jsonOf[NaturePokeathlonStat]
  implicit val NaturePokeathlonStatEncoder: EntityEncoder[NaturePokeathlonStat] = jsonEncoderOf[NaturePokeathlonStat]
}
