goog.provide('API.Client.RegionName');

/**
 * @record
 */
API.Client.RegionName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.RegionName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.RegionName.prototype.language;

