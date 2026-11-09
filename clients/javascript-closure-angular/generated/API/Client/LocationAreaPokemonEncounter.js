goog.provide('API.Client.LocationAreaPokemonEncounter');

/**
 * @record
 */
API.Client.LocationAreaPokemonEncounter = function() {}

/**
 * The Pokémon being encountered.
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.LocationAreaPokemonEncounter.prototype.pokemon;

/**
 * A list of versions and encounters with Pokémon that might happen in the referenced location area.
 * @type {!Array<!API.Client.LocationAreaPokemonEncounterVersion>}
 * @export
 */
API.Client.LocationAreaPokemonEncounter.prototype.versionDetails;

