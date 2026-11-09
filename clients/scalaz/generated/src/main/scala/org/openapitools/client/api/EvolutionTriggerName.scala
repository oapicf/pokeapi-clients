package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionTriggerName._

case class EvolutionTriggerName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object EvolutionTriggerName {
  import DateTimeCodecs._

  implicit val EvolutionTriggerNameCodecJson: CodecJson[EvolutionTriggerName] = CodecJson.derive[EvolutionTriggerName]
  implicit val EvolutionTriggerNameDecoder: EntityDecoder[EvolutionTriggerName] = jsonOf[EvolutionTriggerName]
  implicit val EvolutionTriggerNameEncoder: EntityEncoder[EvolutionTriggerName] = jsonEncoderOf[EvolutionTriggerName]
}
