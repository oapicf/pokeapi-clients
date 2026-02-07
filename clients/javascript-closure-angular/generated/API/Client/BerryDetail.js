goog.provide('API.Client.BerryDetail');

/**
 * @record
 */
API.Client.BerryDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.BerryDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.growthTime;

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.maxHarvest;

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.naturalGiftPower;

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.size;

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.smoothness;

/**
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.soilDryness;

/**
 * @type {!API.Client.BerryFirmnessSummary}
 * @export
 */
API.Client.BerryDetail.prototype.firmness;

/**
 * @type {!Array<!API.Client.BerryDetail_flavors_inner>}
 * @export
 */
API.Client.BerryDetail.prototype.flavors;

/**
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.BerryDetail.prototype.item;

/**
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.BerryDetail.prototype.naturalGiftType;

