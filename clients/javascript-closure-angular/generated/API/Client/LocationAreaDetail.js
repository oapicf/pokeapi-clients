goog.provide('API.Client.LocationAreaDetail');

/**
 * @record
 */
API.Client.LocationAreaDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.LocationAreaDetail.prototype.name;

/**
 * The internal id of an API resource within game data.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaDetail.prototype.gameIndex;

/**
 * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
 * @type {!Array<!API.Client.LocationAreaEncounterRate>}
 * @export
 */
API.Client.LocationAreaDetail.prototype.encounterMethodRates;

/**
 * The region this location area can be found in.
 * @type {!API.Client.LocationSummary}
 * @export
 */
API.Client.LocationAreaDetail.prototype.location;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.LocationAreaName>}
 * @export
 */
API.Client.LocationAreaDetail.prototype.names;

/**
 * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
 * @type {!Array<!API.Client.LocationAreaPokemonEncounter>}
 * @export
 */
API.Client.LocationAreaDetail.prototype.pokemonEncounters;

