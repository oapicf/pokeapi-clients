goog.provide('API.Client.PaginatedSuperContestEffectSummaryList');

/**
 * @record
 */
API.Client.PaginatedSuperContestEffectSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.SuperContestEffectSummary>}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.results;

