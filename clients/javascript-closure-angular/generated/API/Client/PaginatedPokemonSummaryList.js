goog.provide('API.Client.PaginatedPokemonSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokemonSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokemonSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokemonSummary>}
 * @export
 */
API.Client.PaginatedPokemonSummaryList.prototype.results;

