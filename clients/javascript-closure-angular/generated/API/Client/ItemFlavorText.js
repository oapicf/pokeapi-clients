goog.provide('API.Client.ItemFlavorText');

/**
 * @record
 */
API.Client.ItemFlavorText = function() {}

/**
 * The localized flavor text for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.ItemFlavorText.prototype.text;

/**
 * The version group which uses this flavor text.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.ItemFlavorText.prototype.versionGroup;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ItemFlavorText.prototype.language;

