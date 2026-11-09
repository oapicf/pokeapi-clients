goog.provide('API.Client.PokemonDexNumber');

/**
 * @record
 */
API.Client.PokemonDexNumber = function() {}

/**
 * The index of this Pokémon species entry within the Pokédex.
 * @type {!number}
 * @export
 */
API.Client.PokemonDexNumber.prototype.entryNumber;

/**
 * The Pokémon species being encountered.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonDexNumber.prototype.pokemonSpecies;

