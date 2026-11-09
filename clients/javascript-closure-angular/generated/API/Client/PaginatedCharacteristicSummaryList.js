goog.provide('API.Client.PaginatedCharacteristicSummaryList');

/**
 * @record
 */
API.Client.PaginatedCharacteristicSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.CharacteristicSummary>}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.results;

