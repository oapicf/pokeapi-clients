goog.provide('API.Client.PaginatedMachineSummaryList');

/**
 * @record
 */
API.Client.PaginatedMachineSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedMachineSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMachineSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedMachineSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.MachineSummary>}
 * @export
 */
API.Client.PaginatedMachineSummaryList.prototype.results;

