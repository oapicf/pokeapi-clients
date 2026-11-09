goog.provide('API.Client.PaginatedItemPocketSummaryList');

/**
 * @record
 */
API.Client.PaginatedItemPocketSummaryList = function() {}

/**
 * The total number of resources available from this API.
 * @type {!number}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.count;

/**
 * The URL for the next page in the list, or null if there is no next page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.next;

/**
 * The URL for the previous page in the list, or null if there is no previous page.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.previous;

/**
 * A list of API resources on this page.
 * @type {!Array<!API.Client.ItemPocketSummary>}
 * @export
 */
API.Client.PaginatedItemPocketSummaryList.prototype.results;

