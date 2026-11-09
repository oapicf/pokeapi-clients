goog.provide('API.Client.AbilityName');

/**
 * @record
 */
API.Client.AbilityName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.AbilityName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.AbilityName.prototype.language;

