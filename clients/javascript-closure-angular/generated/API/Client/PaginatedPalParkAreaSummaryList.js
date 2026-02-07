goog.provide('API.Client.PaginatedPalParkAreaSummaryList');

/**
 * @record
 */
API.Client.PaginatedPalParkAreaSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedPalParkAreaSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPalParkAreaSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedPalParkAreaSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.PalParkAreaSummary>}
 * @export
 */
API.Client.PaginatedPalParkAreaSummaryList.prototype.results;

