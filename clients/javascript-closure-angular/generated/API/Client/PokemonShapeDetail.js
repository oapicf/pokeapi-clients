goog.provide('API.Client.PokemonShapeDetail');

/**
 * @record
 */
API.Client.PokemonShapeDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.name;

/**
 * @type {!Array<!API.Client.PokemonShapeDetail_awesome_names_inner>}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.awesomeNames;

/**
 * @type {!Array<!API.Client.PokemonShapeDetail_names_inner>}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.pokemonSpecies;

