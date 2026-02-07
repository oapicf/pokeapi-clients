package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDamageClassName._

case class MoveDamageClassName (
  name: String,
language: LanguageSummary)

object MoveDamageClassName {
  import DateTimeCodecs._

  implicit val MoveDamageClassNameCodecJson: CodecJson[MoveDamageClassName] = CodecJson.derive[MoveDamageClassName]
  implicit val MoveDamageClassNameDecoder: EntityDecoder[MoveDamageClassName] = jsonOf[MoveDamageClassName]
  implicit val MoveDamageClassNameEncoder: EntityEncoder[MoveDamageClassName] = jsonEncoderOf[MoveDamageClassName]
}
