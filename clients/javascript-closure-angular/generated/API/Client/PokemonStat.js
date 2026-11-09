goog.provide('API.Client.PokemonStat');

/**
 * @record
 */
API.Client.PokemonStat = function() {}

/**
 * The base value of the stat.
 * @type {!number}
 * @export
 */
API.Client.PokemonStat.prototype.baseStat;

/**
 * The effort points (EV) the Pokémon has in the stat.
 * @type {!number}
 * @export
 */
API.Client.PokemonStat.prototype.effort;

/**
 * The stat the Pokémon has.
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.PokemonStat.prototype.stat;

