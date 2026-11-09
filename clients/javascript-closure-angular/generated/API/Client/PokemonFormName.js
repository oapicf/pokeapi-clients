goog.provide('API.Client.PokemonFormName');

/**
 * @record
 */
API.Client.PokemonFormName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonFormName.prototype.language;

