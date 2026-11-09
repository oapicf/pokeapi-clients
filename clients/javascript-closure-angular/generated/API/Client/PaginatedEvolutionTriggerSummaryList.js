goog.provide('API.Client.PaginatedEvolutionTriggerSummaryList');

/**
 * @record
 */
API.Client.PaginatedEvolutionTriggerSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.EvolutionTriggerSummary>}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.results;

