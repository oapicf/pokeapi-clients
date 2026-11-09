goog.provide('API.Client.MoveTargetDescription');

/**
 * @record
 */
API.Client.MoveTargetDescription = function() {}

/**
 * The localized description for an API resource in a specific language.
 * @type {!string}
 * @export
 */
API.Client.MoveTargetDescription.prototype.description;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.MoveTargetDescription.prototype.language;

