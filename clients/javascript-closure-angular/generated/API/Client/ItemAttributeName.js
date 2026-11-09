goog.provide('API.Client.ItemAttributeName');

/**
 * @record
 */
API.Client.ItemAttributeName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemAttributeName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemAttributeName.prototype.language;

