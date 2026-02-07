goog.provide('API.Client.PaginatedMoveBattleStyleSummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveBattleStyleSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveBattleStyleSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveBattleStyleSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveBattleStyleSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveBattleStyleSummary>}
 * @export
 */
API.Client.PaginatedMoveBattleStyleSummaryList.prototype.results;

