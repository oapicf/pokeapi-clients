goog.provide('API.Client.AbilityFlavorText');

/**
 * @record
 */
API.Client.AbilityFlavorText = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.AbilityFlavorText.prototype.flavorText;

/**
 * The language this text resource is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.AbilityFlavorText.prototype.language;

/**
 * The version group that uses this flavor text.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.AbilityFlavorText.prototype.versionGroup;

