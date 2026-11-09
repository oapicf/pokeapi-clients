package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionConditionExpression.
  * @param expression Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
  * @param percentageChance Percentage chance of evolution under this condition (0-100)
  * @param variables Evolution variables referenced in the expression
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionConditionExpression(
  expression: String,
  percentageChance: Double,
  variables: List[EvolutionVariableSummary]
)

object EvolutionConditionExpression {
  implicit lazy val evolutionConditionExpressionJsonFormat: Format[EvolutionConditionExpression] = Json.format[EvolutionConditionExpression]
}

