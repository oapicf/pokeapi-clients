goog.provide('API.Client.EncounterMethodName');

/**
 * @record
 */
API.Client.EncounterMethodName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.EncounterMethodName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.EncounterMethodName.prototype.language;

