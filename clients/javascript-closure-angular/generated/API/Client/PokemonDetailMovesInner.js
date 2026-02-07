goog.provide('API.Client.PokemonDetail_moves_inner');

/**
 * @record
 */
API.Client.PokemonDetailMovesInner = function() {}

/**
 * @type {!API.Client.AbilityDetail_pokemon_inner_pokemon}
 * @export
 */
API.Client.PokemonDetailMovesInner.prototype.move;

/**
 * @type {!Array<!API.Client.PokemonDetail_moves_inner_version_group_details_inner>}
 * @export
 */
API.Client.PokemonDetailMovesInner.prototype.versionGroupDetails;

