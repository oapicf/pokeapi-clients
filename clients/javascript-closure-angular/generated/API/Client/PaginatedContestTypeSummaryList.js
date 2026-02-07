goog.provide('API.Client.PaginatedContestTypeSummaryList');

/**
 * @record
 */
API.Client.PaginatedContestTypeSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ContestTypeSummary>}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.results;

