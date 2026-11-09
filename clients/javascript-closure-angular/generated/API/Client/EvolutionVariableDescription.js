goog.provide('API.Client.EvolutionVariableDescription');

/**
 * @record
 */
API.Client.EvolutionVariableDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.EvolutionVariableDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.EvolutionVariableDescription.prototype.language;

