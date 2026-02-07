goog.provide('API.Client.EvolutionTriggerDetail');

/**
 * @record
 */
API.Client.EvolutionTriggerDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.name;

/**
 * @type {!Array<!API.Client.EvolutionTriggerName>}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.names;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.pokemonSpecies;

