package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDamageClassDescription._

case class MoveDamageClassDescription (
  /* The localized description for an API resource in a specific language. */
  description: Option[String],
/* The language this name is in. */
  language: LanguageSummary)

object MoveDamageClassDescription {
  import DateTimeCodecs._

  implicit val MoveDamageClassDescriptionCodecJson: CodecJson[MoveDamageClassDescription] = CodecJson.derive[MoveDamageClassDescription]
  implicit val MoveDamageClassDescriptionDecoder: EntityDecoder[MoveDamageClassDescription] = jsonOf[MoveDamageClassDescription]
  implicit val MoveDamageClassDescriptionEncoder: EntityEncoder[MoveDamageClassDescription] = jsonEncoderOf[MoveDamageClassDescription]
}
