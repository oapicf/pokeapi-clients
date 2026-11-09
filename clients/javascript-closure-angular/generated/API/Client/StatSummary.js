goog.provide('API.Client.StatSummary');

/**
 * @record
 */
API.Client.StatSummary = function() {}

/**
 * The name of the referenced resource.
 * @type {!string}
 * @export
 */
API.Client.StatSummary.prototype.name;

/**
 * The URL of the referenced resource.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.StatSummary.prototype.url;

