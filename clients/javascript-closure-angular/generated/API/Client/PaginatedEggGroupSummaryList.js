goog.provide('API.Client.PaginatedEggGroupSummaryList');

/**
 * @record
 */
API.Client.PaginatedEggGroupSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.EggGroupSummary>}
 * @export
 */
API.Client.PaginatedEggGroupSummaryList.prototype.results;

