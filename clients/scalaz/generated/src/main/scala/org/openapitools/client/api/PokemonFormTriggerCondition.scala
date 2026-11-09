package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonFormTriggerCondition._

case class PokemonFormTriggerCondition (
  /* The trigger for this form change. */
  trigger: String,
/* The name of the required item, ability, or move. Only present for a resource-based trigger. */
  name: Option[String],
/* The URL of the required item, ability, or move. Only present for a resource-based trigger. */
  url: Option[URI],
/* The required base form. Only present when the trigger specifies one. */
  baseForm: Option[PokemonFormSummary])

object PokemonFormTriggerCondition {
  import DateTimeCodecs._

  implicit val PokemonFormTriggerConditionCodecJson: CodecJson[PokemonFormTriggerCondition] = CodecJson.derive[PokemonFormTriggerCondition]
  implicit val PokemonFormTriggerConditionDecoder: EntityDecoder[PokemonFormTriggerCondition] = jsonOf[PokemonFormTriggerCondition]
  implicit val PokemonFormTriggerConditionEncoder: EntityEncoder[PokemonFormTriggerCondition] = jsonEncoderOf[PokemonFormTriggerCondition]
}
