goog.provide('API.Client.LocationDetail');

/**
 * @record
 */
API.Client.LocationDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.LocationDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.LocationDetail.prototype.name;

/**
 * The region this location can be found in.
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.LocationDetail.prototype.region;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.LocationName>}
 * @export
 */
API.Client.LocationDetail.prototype.names;

/**
 * A list of game indices relevent to this location by generation.
 * @type {!Array<!API.Client.LocationGameIndex>}
 * @export
 */
API.Client.LocationDetail.prototype.gameIndices;

/**
 * Areas that can be found within this location.
 * @type {!Array<!API.Client.LocationAreaSummary>}
 * @export
 */
API.Client.LocationDetail.prototype.areas;

