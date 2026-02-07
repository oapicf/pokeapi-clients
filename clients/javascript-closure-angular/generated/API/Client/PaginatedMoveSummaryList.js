goog.provide('API.Client.PaginatedMoveSummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.PaginatedMoveSummaryList.prototype.results;

