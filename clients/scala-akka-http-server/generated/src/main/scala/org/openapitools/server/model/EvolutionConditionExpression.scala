package org.openapitools.server.model


/**
 * @param expression Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==') for example: ''null''
 * @param percentageChance Percentage chance of evolution under this condition (0-100) for example: ''null''
 * @param variables Evolution variables referenced in the expression for example: ''null''
*/
final case class EvolutionConditionExpression (
  expression: String,
  percentageChance: Double,
  variables: Seq[EvolutionVariableSummary]
)

