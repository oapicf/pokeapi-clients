goog.provide('API.Client.MoveFlavorText');

/**
 * @record
 */
API.Client.MoveFlavorText = function() {}

/**
 * The localized flavor text for an api resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.MoveFlavorText.prototype.flavorText;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.MoveFlavorText.prototype.language;

/**
 * The version group that uses this flavor text.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.MoveFlavorText.prototype.versionGroup;

