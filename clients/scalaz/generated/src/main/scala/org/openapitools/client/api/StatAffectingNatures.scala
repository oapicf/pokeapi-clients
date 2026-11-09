package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatAffectingNatures._

case class StatAffectingNatures (
  /* A list of natures and how they change the referenced stat. */
  increase: List[NatureSummary],
/* A list of nature sand how they change the referenced stat. */
  decrease: List[NatureSummary])

object StatAffectingNatures {
  import DateTimeCodecs._

  implicit val StatAffectingNaturesCodecJson: CodecJson[StatAffectingNatures] = CodecJson.derive[StatAffectingNatures]
  implicit val StatAffectingNaturesDecoder: EntityDecoder[StatAffectingNatures] = jsonOf[StatAffectingNatures]
  implicit val StatAffectingNaturesEncoder: EntityEncoder[StatAffectingNatures] = jsonEncoderOf[StatAffectingNatures]
}
