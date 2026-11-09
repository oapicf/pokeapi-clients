goog.provide('API.Client.MoveEffectEffectText');

/**
 * @record
 */
API.Client.MoveEffectEffectText = function() {}

/**
 * The localized effect text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.MoveEffectEffectText.prototype.effect;

/**
 * The localized effect text in brief.
 * @type {!string}
 * @export
 */
API.Client.MoveEffectEffectText.prototype.shortEffect;

/**
 * The language this effect is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.MoveEffectEffectText.prototype.language;

