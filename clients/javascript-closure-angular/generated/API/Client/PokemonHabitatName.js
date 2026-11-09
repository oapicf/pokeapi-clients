goog.provide('API.Client.PokemonHabitatName');

/**
 * @record
 */
API.Client.PokemonHabitatName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokemonHabitatName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonHabitatName.prototype.language;

