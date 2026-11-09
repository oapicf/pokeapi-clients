goog.provide('API.Client.PokemonDexEntry');

/**
 * @record
 */
API.Client.PokemonDexEntry = function() {}

/**
 * The index number within the Pokédex.
 * @type {!number}
 * @export
 */
API.Client.PokemonDexEntry.prototype.entryNumber;

/**
 * The Pokédex the referenced Pokémon species can be found in.
 * @type {!API.Client.PokedexSummary}
 * @export
 */
API.Client.PokemonDexEntry.prototype.pokedex;

