goog.provide('API.Client.PokemonSpeciesDescription');

/**
 * @record
 */
API.Client.PokemonSpeciesDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokemonSpeciesDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonSpeciesDescription.prototype.language;

