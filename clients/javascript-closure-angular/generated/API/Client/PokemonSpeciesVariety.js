goog.provide('API.Client.PokemonSpeciesVariety');

/**
 * @record
 */
API.Client.PokemonSpeciesVariety = function() {}

/**
 * Whether this variety is the default variety.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesVariety.prototype.isDefault;

/**
 * The Pokémon variety.
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.PokemonSpeciesVariety.prototype.pokemon;

