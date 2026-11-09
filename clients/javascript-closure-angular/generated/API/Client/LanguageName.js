goog.provide('API.Client.LanguageName');

/**
 * @record
 */
API.Client.LanguageName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.LanguageName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.LanguageName.prototype.language;

