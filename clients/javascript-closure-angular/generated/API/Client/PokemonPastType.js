goog.provide('API.Client.PokemonPastType');

/**
 * @record
 */
API.Client.PokemonPastType = function() {}

/**
 * The last generation in which the referenced pokémon had the listed types.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.PokemonPastType.prototype.generation;

/**
 * The types the referenced pokémon had up to and including the listed generation.
 * @type {!Array<!API.Client.PokemonType>}
 * @export
 */
API.Client.PokemonPastType.prototype.types;

