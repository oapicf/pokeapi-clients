goog.provide('API.Client.PaginatedBerryFirmnessSummaryList');

/**
 * @record
 */
API.Client.PaginatedBerryFirmnessSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedBerryFirmnessSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedBerryFirmnessSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedBerryFirmnessSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.BerryFirmnessSummary>}
 * @export
 */
API.Client.PaginatedBerryFirmnessSummaryList.prototype.results;

