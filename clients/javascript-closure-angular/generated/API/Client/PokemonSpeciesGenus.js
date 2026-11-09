goog.provide('API.Client.PokemonSpeciesGenus');

/**
 * @record
 */
API.Client.PokemonSpeciesGenus = function() {}

/**
 * The localized genus for the referenced Pokémon species
 * @type {!string}
 * @export
 */
API.Client.PokemonSpeciesGenus.prototype.genus;

/**
 * The language this genus is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonSpeciesGenus.prototype.language;

