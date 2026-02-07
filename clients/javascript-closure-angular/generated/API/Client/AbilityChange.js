goog.provide('API.Client.AbilityChange');

/**
 * @record
 */
API.Client.AbilityChange = function() {}

/**
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.AbilityChange.prototype.versionGroup;

/**
 * @type {!Array<!API.Client.AbilityChangeEffectText>}
 * @export
 */
API.Client.AbilityChange.prototype.effectEntries;

