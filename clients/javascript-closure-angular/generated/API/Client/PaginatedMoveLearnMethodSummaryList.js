goog.provide('API.Client.PaginatedMoveLearnMethodSummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveLearnMethodSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveLearnMethodSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveLearnMethodSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveLearnMethodSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveLearnMethodSummary>}
 * @export
 */
API.Client.PaginatedMoveLearnMethodSummaryList.prototype.results;

