goog.provide('API.Client.PaginatedEncounterConditionValueSummaryList');

/**
 * @record
 */
API.Client.PaginatedEncounterConditionValueSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedEncounterConditionValueSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterConditionValueSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterConditionValueSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.EncounterConditionValueSummary>}
 * @export
 */
API.Client.PaginatedEncounterConditionValueSummaryList.prototype.results;

