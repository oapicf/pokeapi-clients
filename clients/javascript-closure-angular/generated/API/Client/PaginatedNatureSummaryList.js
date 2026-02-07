goog.provide('API.Client.PaginatedNatureSummaryList');

/**
 * @record
 */
API.Client.PaginatedNatureSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedNatureSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedNatureSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedNatureSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.NatureSummary>}
 * @export
 */
API.Client.PaginatedNatureSummaryList.prototype.results;

