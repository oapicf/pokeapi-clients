goog.provide('API.Client.PaginatedContestEffectSummaryList');

/**
 * @record
 */
API.Client.PaginatedContestEffectSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.ContestEffectSummary>}
 * @export
 */
API.Client.PaginatedContestEffectSummaryList.prototype.results;

