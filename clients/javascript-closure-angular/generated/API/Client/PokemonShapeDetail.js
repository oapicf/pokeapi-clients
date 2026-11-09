goog.provide('API.Client.PokemonShapeDetail');

/**
 * @record
 */
API.Client.PokemonShapeDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.name;

/**
 * The \"scientific\" name of this Pokémon shape listed in different languages.
 * @type {!Array<!API.Client.PokemonShapeAwesomeName>}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.awesomeNames;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PokemonShapeName>}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.names;

/**
 * A list of the Pokémon species that have this shape.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PokemonShapeDetail.prototype.pokemonSpecies;

