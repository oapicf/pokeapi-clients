goog.provide('API.Client.PokemonEncounterResponse');

/**
 * @record
 */
API.Client.PokemonEncounterResponse = function() {}

/**
 * The location area the referenced Pokémon can be encountered in.
 * @type {!API.Client.LocationAreaSummary}
 * @export
 */
API.Client.PokemonEncounterResponse.prototype.locationArea;

/**
 * A list of versions and encounters with the referenced Pokémon that might happen.
 * @type {!Array<!API.Client.PokemonEncounterVersionDetailResponse>}
 * @export
 */
API.Client.PokemonEncounterResponse.prototype.versionDetails;

