goog.provide('API.Client.MoveMetaCategoryDetail');

/**
 * @record
 */
API.Client.MoveMetaCategoryDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.name;

/**
 * @type {!Array<!API.Client.MoveMetaCategoryDescription>}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.MoveMetaCategoryDetail.prototype.moves;

