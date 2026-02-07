goog.provide('API.Client.PaginatedPokeathlonStatSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokeathlonStatSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokeathlonStatSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokeathlonStatSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokeathlonStatSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokeathlonStatSummary>}
 * @export
 */
API.Client.PaginatedPokeathlonStatSummaryList.prototype.results;

