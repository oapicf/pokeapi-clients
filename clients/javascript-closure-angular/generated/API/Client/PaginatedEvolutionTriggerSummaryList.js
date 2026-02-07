goog.provide('API.Client.PaginatedEvolutionTriggerSummaryList');

/**
 * @record
 */
API.Client.PaginatedEvolutionTriggerSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.EvolutionTriggerSummary>}
 * @export
 */
API.Client.PaginatedEvolutionTriggerSummaryList.prototype.results;

