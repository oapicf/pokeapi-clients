goog.provide('API.Client.PaginatedPokemonHabitatSummaryList');

/**
 * @record
 */
API.Client.PaginatedPokemonHabitatSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPokemonHabitatSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonHabitatSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPokemonHabitatSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PokemonHabitatSummary>}
 * @export
 */
API.Client.PaginatedPokemonHabitatSummaryList.prototype.results;

