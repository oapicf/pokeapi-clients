goog.provide('API.Client.PokemonDetail_held_items');

/**
 * @record
 */
API.Client.PokemonDetailHeldItems = function() {}

/**
 * @type {!API.Client.AbilityDetail_pokemon_inner_pokemon}
 * @export
 */
API.Client.PokemonDetailHeldItems.prototype.item;

/**
 * @type {!Array<!API.Client.ItemDetail_held_by_pokemon_inner_version_details_inner>}
 * @export
 */
API.Client.PokemonDetailHeldItems.prototype.versionDetails;

