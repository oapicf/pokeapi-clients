goog.provide('API.Client.PaginatedAbilitySummaryList');

/**
 * @record
 */
API.Client.PaginatedAbilitySummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedAbilitySummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedAbilitySummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedAbilitySummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.AbilitySummary>}
 * @export
 */
API.Client.PaginatedAbilitySummaryList.prototype.results;

