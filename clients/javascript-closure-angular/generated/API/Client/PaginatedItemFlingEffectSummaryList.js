goog.provide('API.Client.PaginatedItemFlingEffectSummaryList');

/**
 * @record
 */
API.Client.PaginatedItemFlingEffectSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedItemFlingEffectSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemFlingEffectSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemFlingEffectSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ItemFlingEffectSummary>}
 * @export
 */
API.Client.PaginatedItemFlingEffectSummaryList.prototype.results;

