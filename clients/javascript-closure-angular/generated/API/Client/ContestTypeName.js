goog.provide('API.Client.ContestTypeName');

/**
 * @record
 */
API.Client.ContestTypeName = function() {}

/**
 * The name for this contest.
 * @type {!string}
 * @export
 */
API.Client.ContestTypeName.prototype.name;

/**
 * The color associated with this contest's name.
 * @type {!string}
 * @export
 */
API.Client.ContestTypeName.prototype.color;

/**
 * The language that this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.ContestTypeName.prototype.language;

