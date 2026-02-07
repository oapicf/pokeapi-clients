goog.provide('API.Client.PaginatedMoveMetaCategorySummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveMetaCategorySummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveMetaCategorySummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveMetaCategorySummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveMetaCategorySummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveMetaCategorySummary>}
 * @export
 */
API.Client.PaginatedMoveMetaCategorySummaryList.prototype.results;

