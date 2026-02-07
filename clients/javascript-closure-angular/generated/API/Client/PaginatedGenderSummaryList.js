goog.provide('API.Client.PaginatedGenderSummaryList');

/**
 * @record
 */
API.Client.PaginatedGenderSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedGenderSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedGenderSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedGenderSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.GenderSummary>}
 * @export
 */
API.Client.PaginatedGenderSummaryList.prototype.results;

