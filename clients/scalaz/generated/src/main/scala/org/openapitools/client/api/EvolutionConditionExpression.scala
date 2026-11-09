package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionConditionExpression._

case class EvolutionConditionExpression (
  /* Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==') */
  expression: String,
/* Percentage chance of evolution under this condition (0-100) */
  percentageChance: Double,
/* Evolution variables referenced in the expression */
  variables: List[EvolutionVariableSummary])

object EvolutionConditionExpression {
  import DateTimeCodecs._

  implicit val EvolutionConditionExpressionCodecJson: CodecJson[EvolutionConditionExpression] = CodecJson.derive[EvolutionConditionExpression]
  implicit val EvolutionConditionExpressionDecoder: EntityDecoder[EvolutionConditionExpression] = jsonOf[EvolutionConditionExpression]
  implicit val EvolutionConditionExpressionEncoder: EntityEncoder[EvolutionConditionExpression] = jsonEncoderOf[EvolutionConditionExpression]
}
