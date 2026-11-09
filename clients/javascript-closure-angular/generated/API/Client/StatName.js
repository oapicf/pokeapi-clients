goog.provide('API.Client.StatName');

/**
 * @record
 */
API.Client.StatName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.StatName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.StatName.prototype.language;

