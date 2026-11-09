
package org.openapitools.client.model


case class EvolutionConditionExpression (
    /* Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==') */
    _expression: String,
    /* Percentage chance of evolution under this condition (0-100) */
    _percentageChance: Double,
    /* Evolution variables referenced in the expression */
    _variables: List[EvolutionVariableSummary]
)
object EvolutionConditionExpression {
    def toStringBody(var_expression: Object, var_percentageChance: Object, var_variables: Object) =
        s"""
        | {
        | "expression":$var_expression,"percentageChance":$var_percentageChance,"variables":$var_variables
        | }
        """.stripMargin
}
