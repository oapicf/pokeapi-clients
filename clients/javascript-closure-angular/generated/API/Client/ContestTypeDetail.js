goog.provide('API.Client.ContestTypeDetail');

/**
 * @record
 */
API.Client.ContestTypeDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ContestTypeDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ContestTypeDetail.prototype.name;

/**
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.ContestTypeDetail.prototype.berryFlavor;

/**
 * @type {!Array<!API.Client.ContestTypeName>}
 * @export
 */
API.Client.ContestTypeDetail.prototype.names;

