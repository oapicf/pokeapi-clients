goog.provide('API.Client.EvolutionConditionExpression');

/**
 * @record
 */
API.Client.EvolutionConditionExpression = function() {}

/**
 * Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
 * @type {!string}
 * @export
 */
API.Client.EvolutionConditionExpression.prototype.expression;

/**
 * Percentage chance of evolution under this condition (0-100)
 * @type {!number}
 * @export
 */
API.Client.EvolutionConditionExpression.prototype.percentageChance;

/**
 * Evolution variables referenced in the expression
 * @type {!Array<!API.Client.EvolutionVariableSummary>}
 * @export
 */
API.Client.EvolutionConditionExpression.prototype.variables;

