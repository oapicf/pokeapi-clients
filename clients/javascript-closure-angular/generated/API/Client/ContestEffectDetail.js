goog.provide('API.Client.ContestEffectDetail');

/**
 * @record
 */
API.Client.ContestEffectDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ContestEffectDetail.prototype.id;

/**
 * @type {!number}
 * @export
 */
API.Client.ContestEffectDetail.prototype.appeal;

/**
 * @type {!number}
 * @export
 */
API.Client.ContestEffectDetail.prototype.jam;

/**
 * @type {!Array<!API.Client.ContestEffectEffectText>}
 * @export
 */
API.Client.ContestEffectDetail.prototype.effectEntries;

/**
 * @type {!Array<!API.Client.ContestEffectFlavorText>}
 * @export
 */
API.Client.ContestEffectDetail.prototype.flavorTextEntries;

