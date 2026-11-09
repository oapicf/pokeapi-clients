goog.provide('API.Client.BerryFirmnessDetail');

/**
 * @record
 */
API.Client.BerryFirmnessDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.name;

/**
 * A list of the berries with this firmness.
 * @type {!Array<!API.Client.BerrySummary>}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.berries;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.BerryFirmnessName>}
 * @export
 */
API.Client.BerryFirmnessDetail.prototype.names;

