goog.provide('API.Client.PaginatedEggGroupSummaryList');

/**
 * @record
 */
API.Client.PaginatedEggGroupSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.EggGroupSummary>}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.results;

