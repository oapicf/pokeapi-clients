goog.provide('API.Client.BerryFlavorDetail');

/**
 * @record
 */
API.Client.BerryFlavorDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.name;

/**
 * @type {!Array<!API.Client.BerryFlavorDetail_berries_inner>}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.berries;

/**
 * @type {!API.Client.ContestTypeSummary}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.contestType;

/**
 * @type {!Array<!API.Client.BerryFlavorName>}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.names;

