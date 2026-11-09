goog.provide('API.Client.LocationAreaEncounterRate');

/**
 * @record
 */
API.Client.LocationAreaEncounterRate = function() {}

/**
 * The method in which Pokémon may be encountered in an area..
 * @type {!API.Client.EncounterMethodSummary}
 * @export
 */
API.Client.LocationAreaEncounterRate.prototype.encounterMethod;

/**
 * The chance of the encounter to occur on a version of the game.
 * @type {!Array<!API.Client.LocationAreaEncounterVersionDetail>}
 * @export
 */
API.Client.LocationAreaEncounterRate.prototype.versionDetails;

