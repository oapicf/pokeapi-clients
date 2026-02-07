goog.provide('API.Client.PokemonColorDetail');

/**
 * @record
 */
API.Client.PokemonColorDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonColorDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonColorDetail.prototype.name;

/**
 * @type {!Array<!API.Client.PokemonColorName>}
 * @export
 */
API.Client.PokemonColorDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PokemonColorDetail.prototype.pokemonSpecies;

