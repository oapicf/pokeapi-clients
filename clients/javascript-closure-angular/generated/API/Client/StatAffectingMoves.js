goog.provide('API.Client.StatAffectingMoves');

/**
 * @record
 */
API.Client.StatAffectingMoves = function() {}

/**
 * A list of moves and how they change the referenced stat.
 * @type {!Array<!API.Client.MoveStatChange>}
 * @export
 */
API.Client.StatAffectingMoves.prototype.increase;

/**
 * A list of moves and how they change the referenced stat.
 * @type {!Array<!API.Client.MoveStatChange>}
 * @export
 */
API.Client.StatAffectingMoves.prototype.decrease;

