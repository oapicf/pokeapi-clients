goog.provide('API.Client.PaginatedBerrySummaryList');

/**
 * @record
 */
API.Client.PaginatedBerrySummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedBerrySummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedBerrySummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedBerrySummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.BerrySummary>}
 * @export
 */
API.Client.PaginatedBerrySummaryList.prototype.results;

