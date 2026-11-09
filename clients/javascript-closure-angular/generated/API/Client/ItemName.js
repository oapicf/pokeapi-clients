goog.provide('API.Client.ItemName');

/**
 * @record
 */
API.Client.ItemName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemName.prototype.language;

