goog.provide('API.Client.MoveTargetDetail');

/**
 * @record
 */
API.Client.MoveTargetDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveTargetDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.MoveTargetDetail.prototype.name;

/**
 * @type {!Array<!API.Client.MoveTargetDescription>}
 * @export
 */
API.Client.MoveTargetDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveTargetDetail.prototype.moves;

/**
 * @type {!Array<!API.Client.MoveTargetName>}
 * @export
 */
API.Client.MoveTargetDetail.prototype.names;

