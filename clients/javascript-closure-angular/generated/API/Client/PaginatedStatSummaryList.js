goog.provide('API.Client.PaginatedStatSummaryList');

/**
 * @record
 */
API.Client.PaginatedStatSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedStatSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedStatSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedStatSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.StatSummary>}
 * @export
 */
API.Client.PaginatedStatSummaryList.prototype.results;

