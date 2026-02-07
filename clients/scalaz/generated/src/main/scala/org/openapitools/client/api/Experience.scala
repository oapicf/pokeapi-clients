package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Experience._

case class Experience (
  level: Integer,
experience: Integer)

object Experience {
  import DateTimeCodecs._

  implicit val ExperienceCodecJson: CodecJson[Experience] = CodecJson.derive[Experience]
  implicit val ExperienceDecoder: EntityDecoder[Experience] = jsonOf[Experience]
  implicit val ExperienceEncoder: EntityEncoder[Experience] = jsonEncoderOf[Experience]
}
