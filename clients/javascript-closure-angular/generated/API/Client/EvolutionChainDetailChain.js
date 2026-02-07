goog.provide('API.Client.EvolutionChainDetail_chain');

/**
 * @record
 */
API.Client.EvolutionChainDetailChain = function() {}

/**
 * @type {!Array<!API.Client.AnyType>}
 * @export
 */
API.Client.EvolutionChainDetailChain.prototype.evolutionDetails;

/**
 * @type {!Array<!API.Client.EvolutionChainDetail_chain_evolves_to_inner>}
 * @export
 */
API.Client.EvolutionChainDetailChain.prototype.evolvesTo;

/**
 * @type {!boolean}
 * @export
 */
API.Client.EvolutionChainDetailChain.prototype.isBaby;

/**
 * @type {!API.Client.AbilityDetail_pokemon_inner_pokemon}
 * @export
 */
API.Client.EvolutionChainDetailChain.prototype.species;

