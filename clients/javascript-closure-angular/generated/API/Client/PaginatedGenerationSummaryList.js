goog.provide('API.Client.PaginatedGenerationSummaryList');

/**
 * @record
 */
API.Client.PaginatedGenerationSummaryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PaginatedGenerationSummaryList.prototype.count;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedGenerationSummaryList.prototype.next;

/**
 * @type {!API.Client.URI}
 * @export
 */
API.Client.PaginatedGenerationSummaryList.prototype.previous;

/**
 * @type {!Array<!API.Client.GenerationSummary>}
 * @export
 */
API.Client.PaginatedGenerationSummaryList.prototype.results;

