goog.provide('API.Client.AbilityChange');

/**
 * @record
 */
API.Client.AbilityChange = function() {}

/**
 * The version group in which the previous effect of this ability originated.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.AbilityChange.prototype.versionGroup;

/**
 * The previous effect of this ability listed in different languages.
 * @type {!Array<!API.Client.AbilityChangeEffectText>}
 * @export
 */
API.Client.AbilityChange.prototype.effectEntries;

