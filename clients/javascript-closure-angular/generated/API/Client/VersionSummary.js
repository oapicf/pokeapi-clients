goog.provide('API.Client.VersionSummary');

/**
 * @record
 */
API.Client.VersionSummary = function() {}

/**
 * The name of the referenced resource.
 * @type {!string}
 * @export
 */
API.Client.VersionSummary.prototype.name;

/**
 * The URL of the referenced resource.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.VersionSummary.prototype.url;

