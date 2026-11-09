package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionVariableDescription._

case class EvolutionVariableDescription (
  /* The localized description for an API resource in a specific language. */
  description: Option[String],
/* The language this name is in. */
  language: LanguageSummary)

object EvolutionVariableDescription {
  import DateTimeCodecs._

  implicit val EvolutionVariableDescriptionCodecJson: CodecJson[EvolutionVariableDescription] = CodecJson.derive[EvolutionVariableDescription]
  implicit val EvolutionVariableDescriptionDecoder: EntityDecoder[EvolutionVariableDescription] = jsonOf[EvolutionVariableDescription]
  implicit val EvolutionVariableDescriptionEncoder: EntityEncoder[EvolutionVariableDescription] = jsonEncoderOf[EvolutionVariableDescription]
}
