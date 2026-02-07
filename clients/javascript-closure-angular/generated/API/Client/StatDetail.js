goog.provide('API.Client.StatDetail');

/**
 * @record
 */
API.Client.StatDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.StatDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.StatDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.StatDetail.prototype.gameIndex;

/**
 * @type {!boolean}
 * @export
 */
API.Client.StatDetail.prototype.isBattleOnly;

/**
 * @type {!API.Client.StatDetail_affecting_moves}
 * @export
 */
API.Client.StatDetail.prototype.affectingMoves;

/**
 * @type {!API.Client.StatDetail_affecting_natures}
 * @export
 */
API.Client.StatDetail.prototype.affectingNatures;

/**
 * @type {!Array<!API.Client.CharacteristicSummary>}
 * @export
 */
API.Client.StatDetail.prototype.characteristics;

/**
 * @type {!API.Client.MoveDamageClassSummary}
 * @export
 */
API.Client.StatDetail.prototype.moveDamageClass;

/**
 * @type {!Array<!API.Client.StatName>}
 * @export
 */
API.Client.StatDetail.prototype.names;

