goog.provide('API.Client.PaginatedPokemonFormSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokemonFormSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokemonFormSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonFormSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonFormSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokemonFormSummary>}
 * @export
 */
API.Client.PaginatedPokemonFormSummaryList.prototype.results;

