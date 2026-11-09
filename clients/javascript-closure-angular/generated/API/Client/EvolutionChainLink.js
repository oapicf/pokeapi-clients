goog.provide('API.Client.EvolutionChainLink');

/**
 * @record
 */
API.Client.EvolutionChainLink = function() {}

/**
 * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
 * @type {!boolean}
 * @export
 */
API.Client.EvolutionChainLink.prototype.isBaby;

/**
 * The Pokémon species at this point in the evolution chain.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.EvolutionChainLink.prototype.species;

/**
 * All details regarding the specific details of the referenced Pokémon species evolution.
 * @type {!Array<!API.Client.PokemonEvolution>}
 * @export
 */
API.Client.EvolutionChainLink.prototype.evolutionDetails;

/**
 * A List of chain objects.
 * @type {!Array<!API.Client.EvolutionChainLink>}
 * @export
 */
API.Client.EvolutionChainLink.prototype.evolvesTo;

