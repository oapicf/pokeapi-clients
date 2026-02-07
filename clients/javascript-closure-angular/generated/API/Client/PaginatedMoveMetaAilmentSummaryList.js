goog.provide('API.Client.PaginatedMoveMetaAilmentSummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveMetaAilmentSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveMetaAilmentSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveMetaAilmentSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveMetaAilmentSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveMetaAilmentSummary>}
 * @export
 */
API.Client.PaginatedMoveMetaAilmentSummaryList.prototype.results;

