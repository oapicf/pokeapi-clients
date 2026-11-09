goog.provide('API.Client.CharacteristicDescription');

/**
 * @record
 */
API.Client.CharacteristicDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.CharacteristicDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.CharacteristicDescription.prototype.language;

