goog.provide('API.Client.PaginatedEncounterConditionSummaryList');

/**
 * @record
 */
API.Client.PaginatedEncounterConditionSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.EncounterConditionSummary>}
 * @export
 */
API.Client.PaginatedEncounterConditionSummaryList.prototype.results;

