goog.provide('API.Client.ItemSummary');

/**
 * @record
 */
API.Client.ItemSummary = function() {}

/**
 * The name of the referenced resource.
 * @type {!string}
 * @export
 */
API.Client.ItemSummary.prototype.name;

/**
 * The URL of the referenced resource.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.ItemSummary.prototype.url;

