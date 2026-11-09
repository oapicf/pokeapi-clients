goog.provide('API.Client.MoveCombos');

/**
 * @record
 */
API.Client.MoveCombos = function() {}

/**
 * A detail of moves this move can be used before or after, granting additional appeal points in contests.
 * @type {!API.Client.MoveComboUsage}
 * @export
 */
API.Client.MoveCombos.prototype.normal;

/**
 * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
 * @type {!API.Client.MoveComboUsage}
 * @export
 */
API.Client.MoveCombos.prototype._super;

