goog.provide('API.Client.PaginatedPokedexSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokedexSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokedexSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokedexSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokedexSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokedexSummary>}
 * @export
 */
API.Client.PaginatedPokedexSummaryList.prototype.results;

