goog.provide('API.Client.PokemonDetail_past_types_inner');

/**
 * @record
 */
API.Client.PokemonDetailPastTypesInner = function() {}

/**
 * @type {!API.Client.AbilityDetail_pokemon_inner_pokemon}
 * @export
 */
API.Client.PokemonDetailPastTypesInner.prototype.generation;

/**
 * @type {!Array<!API.Client.PokemonDetail_types_inner>}
 * @export
 */
API.Client.PokemonDetailPastTypesInner.prototype.types;

