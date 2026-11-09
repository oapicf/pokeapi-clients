goog.provide('API.Client.PokemonShapeName');

/**
 * @record
 */
API.Client.PokemonShapeName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokemonShapeName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonShapeName.prototype.language;

