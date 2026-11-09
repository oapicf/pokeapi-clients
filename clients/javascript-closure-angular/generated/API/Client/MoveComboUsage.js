goog.provide('API.Client.MoveComboUsage');

/**
 * @record
 */
API.Client.MoveComboUsage = function() {}

/**
 * A list of moves to use before this move.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveComboUsage.prototype.useBefore;

/**
 * A list of moves to use after this move.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveComboUsage.prototype.useAfter;

