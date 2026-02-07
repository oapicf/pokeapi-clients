goog.provide('API.Client.PaginatedTypeSummaryList');

/**
 * @record
 */
API.Client.PaginatedTypeSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedTypeSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedTypeSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedTypeSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.PaginatedTypeSummaryList.prototype.results;

