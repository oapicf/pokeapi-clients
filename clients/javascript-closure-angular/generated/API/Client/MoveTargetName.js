goog.provide('API.Client.MoveTargetName');

/**
 * @record
 */
API.Client.MoveTargetName = function() {}

/**
 * The localized name for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.MoveTargetName.prototype.name;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.MoveTargetName.prototype.language;

