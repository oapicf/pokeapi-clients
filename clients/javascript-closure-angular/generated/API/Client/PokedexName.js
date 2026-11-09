goog.provide('API.Client.PokedexName');

/**
 * @record
 */
API.Client.PokedexName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokedexName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokedexName.prototype.language;

