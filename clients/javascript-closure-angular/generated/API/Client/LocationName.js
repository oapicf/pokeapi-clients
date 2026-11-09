goog.provide('API.Client.LocationName');

/**
 * @record
 */
API.Client.LocationName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.LocationName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.LocationName.prototype.language;

