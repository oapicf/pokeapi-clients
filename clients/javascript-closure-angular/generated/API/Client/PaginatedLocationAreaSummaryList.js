goog.provide('API.Client.PaginatedLocationAreaSummaryList');

/**
 * @record
 */
API.Client.PaginatedLocationAreaSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedLocationAreaSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLocationAreaSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLocationAreaSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.LocationAreaSummary>}
 * @export
 */
API.Client.PaginatedLocationAreaSummaryList.prototype.results;

