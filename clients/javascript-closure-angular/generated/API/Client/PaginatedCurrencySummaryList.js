goog.provide('API.Client.PaginatedCurrencySummaryList');

/**
 * @record
 */
API.Client.PaginatedCurrencySummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedCurrencySummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedCurrencySummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedCurrencySummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.CurrencySummary>}
 * @export
 */
API.Client.PaginatedCurrencySummaryList.prototype.results;

