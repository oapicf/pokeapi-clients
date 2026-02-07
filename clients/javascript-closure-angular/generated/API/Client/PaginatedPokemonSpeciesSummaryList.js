goog.provide('API.Client.PaginatedPokemonSpeciesSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokemonSpeciesSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokemonSpeciesSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonSpeciesSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonSpeciesSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.PaginatedPokemonSpeciesSummaryList.prototype.results;

