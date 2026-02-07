goog.provide('API.Client.EncounterConditionValueDetail');

/**
 * @record
 */
API.Client.EncounterConditionValueDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.name;

/**
 * @type {!API.Client.EncounterConditionSummary}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.condition;

/**
 * @type {!Array<!API.Client.EncounterConditionValueName>}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.names;

