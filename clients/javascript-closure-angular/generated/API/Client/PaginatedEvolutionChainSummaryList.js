goog.provide('API.Client.PaginatedEvolutionChainSummaryList');

/**
 * @record
 */
API.Client.PaginatedEvolutionChainSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedEvolutionChainSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEvolutionChainSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEvolutionChainSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.EvolutionChainSummary>}
 * @export
 */
API.Client.PaginatedEvolutionChainSummaryList.prototype.results;

