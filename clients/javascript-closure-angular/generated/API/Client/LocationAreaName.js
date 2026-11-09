goog.provide('API.Client.LocationAreaName');

/**
 * @record
 */
API.Client.LocationAreaName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.LocationAreaName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.LocationAreaName.prototype.language;

