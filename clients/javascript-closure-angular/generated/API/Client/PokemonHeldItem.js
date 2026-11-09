goog.provide('API.Client.PokemonHeldItem');

/**
 * @record
 */
API.Client.PokemonHeldItem = function() {}

/**
 * The Pokémon that holds this item.
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.PokemonHeldItem.prototype.pokemon;

/**
 * The details for the version that this item is held in by the Pokémon.
 * @type {!Array<!API.Client.PokemonHeldItemVersion>}
 * @export
 */
API.Client.PokemonHeldItem.prototype.versionDetails;

