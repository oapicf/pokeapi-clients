goog.provide('API.Client.PokemonColorName');

/**
 * @record
 */
API.Client.PokemonColorName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokemonColorName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonColorName.prototype.language;

