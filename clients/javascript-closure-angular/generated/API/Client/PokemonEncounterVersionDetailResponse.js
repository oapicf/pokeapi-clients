goog.provide('API.Client.PokemonEncounterVersionDetailResponse');

/**
 * @record
 */
API.Client.PokemonEncounterVersionDetailResponse = function() {}

/**
 * The game version this encounter happens in.
 * @type {!API.Client.VersionSummary}
 * @export
 */
API.Client.PokemonEncounterVersionDetailResponse.prototype.version;

/**
 * The total percentage of all encounter potential.
 * @type {!number}
 * @export
 */
API.Client.PokemonEncounterVersionDetailResponse.prototype.maxChance;

/**
 * A list of encounters and their specifics.
 * @type {!Array<!API.Client.PokemonEncounterDetailResponse>}
 * @export
 */
API.Client.PokemonEncounterVersionDetailResponse.prototype.encounterDetails;

