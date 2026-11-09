goog.provide('API.Client.CurrencyName');

/**
 * @record
 */
API.Client.CurrencyName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.CurrencyName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.CurrencyName.prototype.language;

