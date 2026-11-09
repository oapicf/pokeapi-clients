goog.provide('API.Client.PokemonGameIndex');

/**
 * @record
 */
API.Client.PokemonGameIndex = function() {}

/**
 * The internal id of an API resource within game data.
 * @type {!number}
 * @export
 */
API.Client.PokemonGameIndex.prototype.gameIndex;

/**
 * The version relevent to this game index.
 * @type {!API.Client.VersionSummary}
 * @export
 */
API.Client.PokemonGameIndex.prototype.version;

