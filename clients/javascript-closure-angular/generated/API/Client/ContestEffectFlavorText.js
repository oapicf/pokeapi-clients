goog.provide('API.Client.ContestEffectFlavorText');

/**
 * @record
 */
API.Client.ContestEffectFlavorText = function() {}

/**
 * The localized flavor text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ContestEffectFlavorText.prototype.flavorText;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ContestEffectFlavorText.prototype.language;

