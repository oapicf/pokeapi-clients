goog.provide('API.Client.PokemonMove');

/**
 * @record
 */
API.Client.PokemonMove = function() {}

/**
 * The move the Pokémon can learn.
 * @type {!API.Client.MoveSummary}
 * @export
 */
API.Client.PokemonMove.prototype.move;

/**
 * The details of the version in which the Pokémon can learn the move.
 * @type {!Array<!API.Client.PokemonMoveVersionGroup>}
 * @export
 */
API.Client.PokemonMove.prototype.versionGroupDetails;

