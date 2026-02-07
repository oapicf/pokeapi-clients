goog.provide('API.Client.PaginatedLanguageSummaryList');

/**
 * @record
 */
API.Client.PaginatedLanguageSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.LanguageSummary>}
 * @export
 */
API.Client.PaginatedLanguageSummaryList.prototype.results;

