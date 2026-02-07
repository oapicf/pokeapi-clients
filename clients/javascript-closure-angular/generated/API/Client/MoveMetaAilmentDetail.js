goog.provide('API.Client.MoveMetaAilmentDetail');

/**
 * @record
 */
API.Client.MoveMetaAilmentDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.name;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.moves;

/**
 * @type {!Array<!API.Client.MoveMetaAilmentName>}
 * @export
 */
API.Client.MoveMetaAilmentDetail.prototype.names;

