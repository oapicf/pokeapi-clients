goog.provide('API.Client.PokemonHeldItemSummary');

/**
 * @record
 */
API.Client.PokemonHeldItemSummary = function() {}

/**
 * The item the referenced Pokémon holds.
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.PokemonHeldItemSummary.prototype.item;

/**
 * The details of the different versions in which the item is held.
 * @type {!Array<!API.Client.PokemonHeldItemVersion>}
 * @export
 */
API.Client.PokemonHeldItemSummary.prototype.versionDetails;

