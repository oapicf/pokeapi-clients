goog.provide('API.Client.PaginatedPokemonShapeSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokemonShapeSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokemonShapeSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonShapeSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonShapeSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokemonShapeSummary>}
 * @export
 */
API.Client.PaginatedPokemonShapeSummaryList.prototype.results;

