goog.provide('API.Client.GenerationName');

/**
 * @record
 */
API.Client.GenerationName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.GenerationName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.GenerationName.prototype.language;

