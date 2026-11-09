goog.provide('API.Client.ItemPocketName');

/**
 * @record
 */
API.Client.ItemPocketName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemPocketName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemPocketName.prototype.language;

