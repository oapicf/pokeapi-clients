goog.provide('API.Client.MoveStatChange');

/**
 * @record
 */
API.Client.MoveStatChange = function() {}

/**
 * The maximum amount of change to the referenced stat.
 * @type {!number}
 * @export
 */
API.Client.MoveStatChange.prototype.change;

/**
 * The move causing the change.
 * @type {!API.Client.MoveSummary}
 * @export
 */
API.Client.MoveStatChange.prototype.move;

