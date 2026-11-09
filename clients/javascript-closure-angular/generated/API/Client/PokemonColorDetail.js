goog.provide('API.Client.PokemonColorDetail');

/**
 * @record
 */
API.Client.PokemonColorDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokemonColorDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokemonColorDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PokemonColorName>}
 * @export
 */
API.Client.PokemonColorDetail.prototype.names;

/**
 * A list of the Pokémon species that have this color.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PokemonColorDetail.prototype.pokemonSpecies;

