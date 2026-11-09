goog.provide('API.Client.PokemonHabitatDetail');

/**
 * @record
 */
API.Client.PokemonHabitatDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PokemonHabitatName>}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.names;

/**
 * A list of the Pokémon species that can be found in this habitat.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PokemonHabitatDetail.prototype.pokemonSpecies;

