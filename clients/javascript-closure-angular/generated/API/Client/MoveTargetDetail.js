goog.provide('API.Client.MoveTargetDetail');

/**
 * @record
 */
API.Client.MoveTargetDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveTargetDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveTargetDetail.prototype.name;

/**
 * The description of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveTargetDescription>}
 * @export
 */
API.Client.MoveTargetDetail.prototype.descriptions;

/**
 * A list of moves that that are directed at this target.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveTargetDetail.prototype.moves;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveTargetName>}
 * @export
 */
API.Client.MoveTargetDetail.prototype.names;

