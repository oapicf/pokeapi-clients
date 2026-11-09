goog.provide('API.Client.PokemonHeldItemVersion');

/**
 * @record
 */
API.Client.PokemonHeldItemVersion = function() {}

/**
 * How often the item is held.
 * @type {!number}
 * @export
 */
API.Client.PokemonHeldItemVersion.prototype.rarity;

/**
 * The version in which the item is held.
 * @type {!API.Client.VersionSummary}
 * @export
 */
API.Client.PokemonHeldItemVersion.prototype.version;

