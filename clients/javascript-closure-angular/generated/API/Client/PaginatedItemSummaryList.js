goog.provide('API.Client.PaginatedItemSummaryList');

/**
 * @record
 */
API.Client.PaginatedItemSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedItemSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.PaginatedItemSummaryList.prototype.results;

