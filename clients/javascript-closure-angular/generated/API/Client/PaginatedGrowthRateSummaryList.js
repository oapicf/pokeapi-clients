goog.provide('API.Client.PaginatedGrowthRateSummaryList');

/**
 * @record
 */
API.Client.PaginatedGrowthRateSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedGrowthRateSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedGrowthRateSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedGrowthRateSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.GrowthRateSummary>}
 * @export
 */
API.Client.PaginatedGrowthRateSummaryList.prototype.results;

