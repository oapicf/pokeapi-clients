goog.provide('API.Client.PaginatedItemCategorySummaryList');

/**
 * @record
 */
API.Client.PaginatedItemCategorySummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedItemCategorySummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemCategorySummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemCategorySummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ItemCategorySummary>}
 * @export
 */
API.Client.PaginatedItemCategorySummaryList.prototype.results;

