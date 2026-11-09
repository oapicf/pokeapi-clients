goog.provide('API.Client.EvolutionChainDetail');

/**
 * @record
 */
API.Client.EvolutionChainDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EvolutionChainDetail.prototype.id;

/**
 * The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.EvolutionChainDetail.prototype.babyTriggerItem;

/**
 * The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
 * @type {!API.Client.EvolutionChainLink}
 * @export
 */
API.Client.EvolutionChainDetail.prototype.chain;

