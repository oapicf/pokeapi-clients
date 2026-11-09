goog.provide('API.Client.PokemonFormTriggerCondition');

/**
 * @record
 */
API.Client.PokemonFormTriggerCondition = function() {}

/**
 * The trigger for this form change.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormTriggerCondition.prototype.trigger;

/**
 * The name of the required item, ability, or move. Only present for a resource-based trigger.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormTriggerCondition.prototype.name;

/**
 * The URL of the required item, ability, or move. Only present for a resource-based trigger.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PokemonFormTriggerCondition.prototype.url;

/**
 * The required base form. Only present when the trigger specifies one.
 * @type {!API.Client.PokemonFormSummary}
 * @export
 */
API.Client.PokemonFormTriggerCondition.prototype.baseForm;

