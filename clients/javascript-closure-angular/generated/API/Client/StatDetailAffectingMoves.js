goog.provide('API.Client.StatDetail_affecting_moves');

/**
 * @record
 */
API.Client.StatDetailAffectingMoves = function() {}

/**
 * @type {!Array<!API.Client.StatDetail_affecting_moves_increase_inner>}
 * @export
 */
API.Client.StatDetailAffectingMoves.prototype.increase;

/**
 * @type {!Array<!API.Client.StatDetail_affecting_moves_increase_inner>}
 * @export
 */
API.Client.StatDetailAffectingMoves.prototype.decrease;

