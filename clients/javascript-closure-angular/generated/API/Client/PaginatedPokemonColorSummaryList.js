goog.provide('API.Client.PaginatedPokemonColorSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokemonColorSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokemonColorSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonColorSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonColorSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokemonColorSummary>}
 * @export
 */
API.Client.PaginatedPokemonColorSummaryList.prototype.results;

