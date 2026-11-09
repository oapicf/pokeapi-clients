goog.provide('API.Client.GenderPokemonSpecies');

/**
 * @record
 */
API.Client.GenderPokemonSpecies = function() {}

/**
 * The chance of this Pokémon being female, in eighths; or -1 for genderless.
 * @type {!number}
 * @export
 */
API.Client.GenderPokemonSpecies.prototype.rate;

/**
 * A Pokémon species that can be the referenced gender.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.GenderPokemonSpecies.prototype.pokemonSpecies;

