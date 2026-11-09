goog.provide('API.Client.NatureName');

/**
 * @record
 */
API.Client.NatureName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.NatureName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.NatureName.prototype.language;

