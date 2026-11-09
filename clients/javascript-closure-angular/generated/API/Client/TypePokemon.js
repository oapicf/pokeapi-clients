goog.provide('API.Client.TypePokemon');

/**
 * @record
 */
API.Client.TypePokemon = function() {}

/**
 * The order the Pokémon's types are listed in.
 * @type {!number}
 * @export
 */
API.Client.TypePokemon.prototype.slot;

/**
 * The Pokémon that has the referenced type.
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.TypePokemon.prototype.pokemon;

