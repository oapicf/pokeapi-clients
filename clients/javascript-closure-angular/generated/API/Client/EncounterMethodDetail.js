goog.provide('API.Client.EncounterMethodDetail');

/**
 * @record
 */
API.Client.EncounterMethodDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.order;

/**
 * @type {!Array<!API.Client.EncounterMethodName>}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.names;

