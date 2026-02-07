goog.provide('API.Client.PaginatedCharacteristicSummaryList');

/**
 * @record
 */
API.Client.PaginatedCharacteristicSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.CharacteristicSummary>}
 * @export
 */
API.Client.PaginatedCharacteristicSummaryList.prototype.results;

