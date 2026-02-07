goog.provide('API.Client.PaginatedSuperContestEffectSummaryList');

/**
 * @record
 */
API.Client.PaginatedSuperContestEffectSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.SuperContestEffectSummary>}
 * @export
 */
API.Client.PaginatedSuperContestEffectSummaryList.prototype.results;

