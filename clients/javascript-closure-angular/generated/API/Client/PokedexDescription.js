goog.provide('API.Client.PokedexDescription');

/**
 * @record
 */
API.Client.PokedexDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokedexDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokedexDescription.prototype.language;

