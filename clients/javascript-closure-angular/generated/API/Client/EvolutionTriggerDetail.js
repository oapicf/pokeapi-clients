goog.provide('API.Client.EvolutionTriggerDetail');

/**
 * @record
 */
API.Client.EvolutionTriggerDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.EvolutionTriggerName>}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.names;

/**
 * A list of pokemon species that result from this evolution trigger.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.EvolutionTriggerDetail.prototype.pokemonSpecies;

