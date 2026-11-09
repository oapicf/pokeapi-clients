goog.provide('API.Client.PaginatedContestTypeSummaryList');

/**
 * @record
 */
API.Client.PaginatedContestTypeSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.ContestTypeSummary>}
 * @export
 */
API.Client.PaginatedContestTypeSummaryList.prototype.results;

