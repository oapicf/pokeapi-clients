goog.provide('API.Client.MoveEffectChange');

/**
 * @record
 */
API.Client.MoveEffectChange = function() {}

/**
 * The version group in which the previous effect of this ability originated.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.MoveEffectChange.prototype.versionGroup;

/**
 * The previous effect of this ability listed in different languages.
 * @type {!Array<!API.Client.MoveEffectChangeEffectText>}
 * @export
 */
API.Client.MoveEffectChange.prototype.effectEntries;

