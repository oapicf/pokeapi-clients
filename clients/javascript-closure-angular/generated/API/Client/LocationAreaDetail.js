goog.provide('API.Client.LocationAreaDetail');

/**
 * @record
 */
API.Client.LocationAreaDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.LocationAreaDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.LocationAreaDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.LocationAreaDetail.prototype.gameIndex;

/**
 * @type {!Array<!API.Client.LocationAreaDetail_encounter_method_rates_inner>}
 * @export
 */
API.Client.LocationAreaDetail.prototype.encounterMethodRates;

/**
 * @type {!API.Client.LocationSummary}
 * @export
 */
API.Client.LocationAreaDetail.prototype.location;

/**
 * @type {!Array<!API.Client.LocationAreaName>}
 * @export
 */
API.Client.LocationAreaDetail.prototype.names;

/**
 * @type {!Array<!API.Client.LocationAreaDetail_pokemon_encounters_inner>}
 * @export
 */
API.Client.LocationAreaDetail.prototype.pokemonEncounters;

