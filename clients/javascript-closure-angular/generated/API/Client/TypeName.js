goog.provide('API.Client.TypeName');

/**
 * @record
 */
API.Client.TypeName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.TypeName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.TypeName.prototype.language;

