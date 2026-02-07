goog.provide('API.Client.EncounterConditionDetail');

/**
 * @record
 */
API.Client.EncounterConditionDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.name;

/**
 * @type {!Array<!API.Client.EncounterConditionValueSummary>}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.values;

/**
 * @type {!Array<!API.Client.EncounterConditionName>}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.names;

