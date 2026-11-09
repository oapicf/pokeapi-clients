goog.provide('API.Client.LocationAreaPokemonEncounterVersion');

/**
 * @record
 */
API.Client.LocationAreaPokemonEncounterVersion = function() {}

/**
 * The game version this encounter happens in.
 * @type {!API.Client.VersionSummary}
 * @export
 */
API.Client.LocationAreaPokemonEncounterVersion.prototype.version;

/**
 * The total percentage of all encounter potential.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaPokemonEncounterVersion.prototype.maxChance;

/**
 * A list of encounters and their specifics.
 * @type {!Array<!API.Client.LocationAreaEncounterDetail>}
 * @export
 */
API.Client.LocationAreaPokemonEncounterVersion.prototype.encounterDetails;

