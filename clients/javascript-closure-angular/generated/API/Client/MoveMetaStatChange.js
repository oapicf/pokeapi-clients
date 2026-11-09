goog.provide('API.Client.MoveMetaStatChange');

/**
 * @record
 */
API.Client.MoveMetaStatChange = function() {}

/**
 * The amount of change.
 * @type {!number}
 * @export
 */
API.Client.MoveMetaStatChange.prototype.change;

/**
 * The stat being affected.
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.MoveMetaStatChange.prototype.stat;

