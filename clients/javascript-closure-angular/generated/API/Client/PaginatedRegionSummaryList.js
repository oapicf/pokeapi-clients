goog.provide('API.Client.PaginatedRegionSummaryList');

/**
 * @record
 */
API.Client.PaginatedRegionSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedRegionSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedRegionSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedRegionSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.RegionSummary>}
 * @export
 */
API.Client.PaginatedRegionSummaryList.prototype.results;

