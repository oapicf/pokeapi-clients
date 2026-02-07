goog.provide('API.Client.PokemonStat');

/**
 * @record
 */
API.Client.PokemonStat = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonStat.prototype.baseStat;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonStat.prototype.effort;

/**
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.PokemonStat.prototype.stat;

