goog.provide('API.Client.PalParkAreaDetail');

/**
 * @record
 */
API.Client.PalParkAreaDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.name;

/**
 * @type {!Array<!API.Client.PalParkAreaName>}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PalParkAreaDetail_pokemon_encounters_inner>}
 * @export
 */
API.Client.PalParkAreaDetail.prototype.pokemonEncounters;

