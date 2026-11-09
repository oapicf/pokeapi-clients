goog.provide('API.Client.PalParkAreaDetail');

/**
 * @record
 */
API.Client.PalParkAreaDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PalParkAreaName>}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.names;

/**
 * A list of Pokémon encountered in thi pal park area along with details.
 * @type {!Array<!API.Client.PalParkEncounter>}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.pokemonEncounters;

