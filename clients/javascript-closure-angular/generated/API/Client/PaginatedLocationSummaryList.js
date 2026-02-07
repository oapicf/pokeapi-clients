goog.provide('API.Client.PaginatedLocationSummaryList');

/**
 * @record
 */
API.Client.PaginatedLocationSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedLocationSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLocationSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLocationSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.LocationSummary>}
 * @export
 */
API.Client.PaginatedLocationSummaryList.prototype.results;

