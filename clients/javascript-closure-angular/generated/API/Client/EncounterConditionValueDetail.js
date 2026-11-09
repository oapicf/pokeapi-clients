goog.provide('API.Client.EncounterConditionValueDetail');

/**
 * @record
 */
API.Client.EncounterConditionValueDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.name;

/**
 * The condition this encounter condition value pertains to.
 * @type {!API.Client.EncounterConditionSummary}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.condition;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.EncounterConditionValueName>}
 * @export
 */
API.Client.EncounterConditionValueDetail.prototype.names;

