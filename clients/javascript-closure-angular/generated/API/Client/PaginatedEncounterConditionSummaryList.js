goog.provide('API.Client.PaginatedEncounterConditionSummaryList');

/**
 * @record
 */
API.Client.PaginatedEncounterConditionSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.EncounterConditionSummary>}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.results;

