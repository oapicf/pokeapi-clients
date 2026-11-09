goog.provide('API.Client.ItemAttributeDescription');

/**
 * @record
 */
API.Client.ItemAttributeDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemAttributeDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemAttributeDescription.prototype.language;

