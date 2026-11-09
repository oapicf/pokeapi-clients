goog.provide('API.Client.AbilityEffectText');

/**
 * @record
 */
API.Client.AbilityEffectText = function() {}

/**
 * The localized effect text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.AbilityEffectText.prototype.effect;

/**
 * The localized effect text in brief.
 * @type {!string}
 * @export
 */
API.Client.AbilityEffectText.prototype.shortEffect;

/**
 * The language this effect is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.AbilityEffectText.prototype.language;

