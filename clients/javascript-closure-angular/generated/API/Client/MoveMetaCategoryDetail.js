goog.provide('API.Client.MoveMetaCategoryDetail');

/**
 * @record
 */
API.Client.MoveMetaCategoryDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.name;

/**
 * The description of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveMetaCategoryDescription>}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.descriptions;

/**
 * A list of moves that fall into this category.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.moves;

