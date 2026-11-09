goog.provide('API.Client.PokeapiMetaResponse');

/**
 * @record
 */
API.Client.PokeapiMetaResponse = function() {}

/**
 * The deployment time as a Unix timestamp string.
 * @type {!string}
 * @export
 */
API.Client.PokeapiMetaResponse.prototype.deployDate;

/**
 * The source commit hash used for this deployment.
 * @type {!string}
 * @export
 */
API.Client.PokeapiMetaResponse.prototype.hash;

/**
 * The deployment tag, or null if the deployment has no tag.
 * @type {!string}
 * @export
 */
API.Client.PokeapiMetaResponse.prototype.tag;

