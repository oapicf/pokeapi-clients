goog.provide('API.Client.LocationAreaEncounterVersionDetail');

/**
 * @record
 */
API.Client.LocationAreaEncounterVersionDetail = function() {}

/**
 * The chance of an encounter to occur.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaEncounterVersionDetail.prototype.rate;

/**
 * The version of the game in which the encounter can occur with the given chance.
 * @type {!API.Client.VersionSummary}
 * @export
 */
API.Client.LocationAreaEncounterVersionDetail.prototype.version;

