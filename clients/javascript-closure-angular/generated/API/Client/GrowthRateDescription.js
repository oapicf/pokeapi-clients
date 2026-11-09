goog.provide('API.Client.GrowthRateDescription');

/**
 * @record
 */
API.Client.GrowthRateDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.GrowthRateDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.GrowthRateDescription.prototype.language;

