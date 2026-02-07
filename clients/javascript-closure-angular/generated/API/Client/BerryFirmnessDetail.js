goog.provide('API.Client.BerryFirmnessDetail');

/**
 * @record
 */
API.Client.BerryFirmnessDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.name;

/**
 * @type {!Array<!API.Client.BerrySummary>}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.berries;

/**
 * @type {!Array<!API.Client.BerryFirmnessName>}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.names;

