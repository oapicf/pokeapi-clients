goog.provide('API.Client.MoveEffectChangeEffectText');

/**
 * @record
 */
API.Client.MoveEffectChangeEffectText = function() {}

/**
 * The localized effect text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.MoveEffectChangeEffectText.prototype.effect;

/**
 * The language this effect is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.MoveEffectChangeEffectText.prototype.language;

