goog.provide('API.Client.PokeathlonStatName');

/**
 * @record
 */
API.Client.PokeathlonStatName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.PokeathlonStatName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokeathlonStatName.prototype.language;

