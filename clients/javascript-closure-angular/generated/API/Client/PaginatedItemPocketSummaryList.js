goog.provide('API.Client.PaginatedItemPocketSummaryList');

/**
 * @record
 */
API.Client.PaginatedItemPocketSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ItemPocketSummary>}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.results;

