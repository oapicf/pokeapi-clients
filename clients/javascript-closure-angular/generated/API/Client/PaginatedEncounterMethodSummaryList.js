goog.provide('API.Client.PaginatedEncounterMethodSummaryList');

/**
 * @record
 */
API.Client.PaginatedEncounterMethodSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedEncounterMethodSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterMethodSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedEncounterMethodSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.EncounterMethodSummary>}
 * @export
 */
API.Client.PaginatedEncounterMethodSummaryList.prototype.results;

