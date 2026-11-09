goog.provide('API.Client.VersionName');

/**
 * @record
 */
API.Client.VersionName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.VersionName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.VersionName.prototype.language;

