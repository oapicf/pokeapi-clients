goog.provide('API.Client.ItemCategoryName');

/**
 * @record
 */
API.Client.ItemCategoryName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemCategoryName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemCategoryName.prototype.language;

