goog.provide('API.Client.PaginatedVersionGroupSummaryList');

/**
 * @record
 */
API.Client.PaginatedVersionGroupSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedVersionGroupSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedVersionGroupSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedVersionGroupSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.VersionGroupSummary>}
 * @export
 */
API.Client.PaginatedVersionGroupSummaryList.prototype.results;

