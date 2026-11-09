goog.provide('API.Client.PaginatedContestEffectSummaryList');

/**
 * @record
 */
API.Client.PaginatedContestEffectSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.ContestEffectSummary>}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.results;

