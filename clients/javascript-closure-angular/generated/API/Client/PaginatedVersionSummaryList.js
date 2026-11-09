goog.provide('API.Client.PaginatedVersionSummaryList');

/**
 * @record
 */
API.Client.PaginatedVersionSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.VersionSummary>}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.results;

