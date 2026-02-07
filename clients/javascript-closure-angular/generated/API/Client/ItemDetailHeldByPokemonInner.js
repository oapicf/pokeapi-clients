goog.provide('API.Client.ItemDetail_held_by_pokemon_inner');

/**
 * @record
 */
API.Client.ItemDetailHeldByPokemonInner = function() {}

/**
 * @type {!API.Client.AbilityDetail_pokemon_inner_pokemon}
 * @export
 */
API.Client.ItemDetailHeldByPokemonInner.prototype.pokemon;

/**
 * @type {!Array<!API.Client.ItemDetail_held_by_pokemon_inner_version_details_inner>}
 * @export
 */
API.Client.ItemDetailHeldByPokemonInner.prototype.versionDetails;

