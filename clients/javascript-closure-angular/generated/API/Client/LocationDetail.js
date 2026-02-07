goog.provide('API.Client.LocationDetail');

/**
 * @record
 */
API.Client.LocationDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.LocationDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.LocationDetail.prototype.name;

/**
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.LocationDetail.prototype.region;

/**
 * @type {!Array<!API.Client.LocationName>}
 * @export
 */
API.Client.LocationDetail.prototype.names;

/**
 * @type {!Array<!API.Client.LocationGameIndex>}
 * @export
 */
API.Client.LocationDetail.prototype.gameIndices;

/**
 * @type {!Array<!API.Client.LocationAreaSummary>}
 * @export
 */
API.Client.LocationDetail.prototype.areas;

