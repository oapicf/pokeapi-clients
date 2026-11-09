package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionVariableName._

case class EvolutionVariableName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object EvolutionVariableName {
  import DateTimeCodecs._

  implicit val EvolutionVariableNameCodecJson: CodecJson[EvolutionVariableName] = CodecJson.derive[EvolutionVariableName]
  implicit val EvolutionVariableNameDecoder: EntityDecoder[EvolutionVariableName] = jsonOf[EvolutionVariableName]
  implicit val EvolutionVariableNameEncoder: EntityEncoder[EvolutionVariableName] = jsonEncoderOf[EvolutionVariableName]
}
