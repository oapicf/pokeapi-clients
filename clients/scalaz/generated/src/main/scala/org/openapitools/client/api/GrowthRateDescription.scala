package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GrowthRateDescription._

case class GrowthRateDescription (
  description: Option[String],
language: LanguageSummary)

object GrowthRateDescription {
  import DateTimeCodecs._

  implicit val GrowthRateDescriptionCodecJson: CodecJson[GrowthRateDescription] = CodecJson.derive[GrowthRateDescription]
  implicit val GrowthRateDescriptionDecoder: EntityDecoder[GrowthRateDescription] = jsonOf[GrowthRateDescription]
  implicit val GrowthRateDescriptionEncoder: EntityEncoder[GrowthRateDescription] = jsonEncoderOf[GrowthRateDescription]
}
