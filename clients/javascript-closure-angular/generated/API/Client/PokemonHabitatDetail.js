goog.provide('API.Client.PokemonHabitatDetail');

/**
 * @record
 */
API.Client.PokemonHabitatDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.name;

/**
 * @type {!Array<!API.Client.PokemonHabitatName>}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.pokemonSpecies;

