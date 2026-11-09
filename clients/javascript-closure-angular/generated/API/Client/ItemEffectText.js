goog.provide('API.Client.ItemEffectText');

/**
 * @record
 */
API.Client.ItemEffectText = function() {}

/**
 * The localized effect text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemEffectText.prototype.effect;

/**
 * The localized effect text in brief.
 * @type {!string}
 * @export
 */
API.Client.ItemEffectText.prototype.shortEffect;

/**
 * The language this effect is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemEffectText.prototype.language;

