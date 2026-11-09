goog.provide('API.Client.EncounterConditionDetail');

/**
 * @record
 */
API.Client.EncounterConditionDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.name;

/**
 * A list of possible values for this encounter condition.
 * @type {!Array<!API.Client.EncounterConditionValueSummary>}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.values;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.EncounterConditionName>}
 * @export
 */
API.Client.EncounterConditionDetail.prototype.names;

