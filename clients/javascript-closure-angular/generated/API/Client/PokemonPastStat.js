goog.provide('API.Client.PokemonPastStat');

/**
 * @record
 */
API.Client.PokemonPastStat = function() {}

/**
 * The last generation in which the referenced pokémon had the listed stats.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.PokemonPastStat.prototype.generation;

/**
 * The stat the Pokémon had up to and including the listed generation.
 * @type {!Array<!API.Client.PokemonStat>}
 * @export
 */
API.Client.PokemonPastStat.prototype.stats;

