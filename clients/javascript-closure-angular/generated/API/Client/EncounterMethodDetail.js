goog.provide('API.Client.EncounterMethodDetail');

/**
 * @record
 */
API.Client.EncounterMethodDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.name;

/**
 * A good value for sorting.
 * @type {!number}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.order;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.EncounterMethodName>}
 * @export
 */
API.Client.EncounterMethodDetail.prototype.names;

