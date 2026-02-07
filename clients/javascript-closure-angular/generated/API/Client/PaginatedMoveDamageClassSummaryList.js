goog.provide('API.Client.PaginatedMoveDamageClassSummaryList');

/**
 * @record
 */
API.Client.PaginatedMoveDamageClassSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMoveDamageClassSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveDamageClassSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMoveDamageClassSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MoveDamageClassSummary>}
 * @export
 */
API.Client.PaginatedMoveDamageClassSummaryList.prototype.results;

