goog.provide('API.Client.CharacteristicDetail');

/**
 * @record
 */
API.Client.CharacteristicDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CharacteristicDetail.prototype.id;

/**
 * @type {!number}
 * @export
 */
API.Client.CharacteristicDetail.prototype.geneModulo;

/**
 * @type {!Array<!number>}
 * @export
 */
API.Client.CharacteristicDetail.prototype.possibleValues;

/**
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.CharacteristicDetail.prototype.highestStat;

/**
 * @type {!Array<!API.Client.CharacteristicDescription>}
 * @export
 */
API.Client.CharacteristicDetail.prototype.descriptions;

