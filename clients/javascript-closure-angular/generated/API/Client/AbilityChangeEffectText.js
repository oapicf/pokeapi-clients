goog.provide('API.Client.AbilityChangeEffectText');

/**
 * @record
 */
API.Client.AbilityChangeEffectText = function() {}

/**
 * The localized effect text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.AbilityChangeEffectText.prototype.effect;

/**
 * The language this effect is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.AbilityChangeEffectText.prototype.language;

