goog.provide('API.Client.PaginatedVersionSummaryList');

/**
 * @record
 */
API.Client.PaginatedVersionSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.VersionSummary>}
 * @export
 */
API.Client.PaginatedVersionSummaryList.prototype.results;

