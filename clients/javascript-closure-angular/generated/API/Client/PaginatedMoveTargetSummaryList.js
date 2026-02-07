goog.provide('API.Client.PaginatedMoveTargetSummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveTargetSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveTargetSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveTargetSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveTargetSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveTargetSummary>}
 * @export
 */
API.Client.PaginatedMoveTargetSummaryList.prototype.results;

