goog.provide('API.Client.PokemonSpeciesName');

/**
 * @record
 */
API.Client.PokemonSpeciesName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokemonSpeciesName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonSpeciesName.prototype.language;

