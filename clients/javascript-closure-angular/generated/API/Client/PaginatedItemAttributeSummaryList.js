goog.provide('API.Client.PaginatedItemAttributeSummaryList');

/**
 * @record
 */
API.Client.PaginatedItemAttributeSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedItemAttributeSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemAttributeSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemAttributeSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ItemAttributeSummary>}
 * @export
 */
API.Client.PaginatedItemAttributeSummaryList.prototype.results;

