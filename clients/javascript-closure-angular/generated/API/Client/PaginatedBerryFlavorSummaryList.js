goog.provide('API.Client.PaginatedBerryFlavorSummaryList');

/**
 * @record
 */
API.Client.PaginatedBerryFlavorSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedBerryFlavorSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedBerryFlavorSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedBerryFlavorSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.BerryFlavorSummary>}
 * @export
 */
API.Client.PaginatedBerryFlavorSummaryList.prototype.results;

