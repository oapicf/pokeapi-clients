goog.provide('API.Client.PokeathlonStatDetail');

/**
 * @record
 */
API.Client.PokeathlonStatDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.name;

/**
 * @type {!API.Client.PokeathlonStatDetail_affecting_natures}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.affectingNatures;

/**
 * @type {!Array<!API.Client.PokeathlonStatName>}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.names;

