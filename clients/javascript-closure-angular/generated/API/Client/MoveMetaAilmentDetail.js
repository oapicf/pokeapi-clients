goog.provide('API.Client.MoveMetaAilmentDetail');

/**
 * @record
 */
API.Client.MoveMetaAilmentDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.name;

/**
 * A list of moves that cause this ailment.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.moves;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveMetaAilmentName>}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.names;

