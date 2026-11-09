goog.provide('API.Client.MoveName');

/**
 * @record
 */
API.Client.MoveName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.MoveName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.MoveName.prototype.language;

