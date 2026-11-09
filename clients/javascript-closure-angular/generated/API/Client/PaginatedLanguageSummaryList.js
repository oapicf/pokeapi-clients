goog.provide('API.Client.PaginatedLanguageSummaryList');

/**
 * @record
 */
API.Client.PaginatedLanguageSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.LanguageSummary>}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.results;

