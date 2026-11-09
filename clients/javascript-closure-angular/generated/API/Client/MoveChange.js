goog.provide('API.Client.MoveChange');

/**
 * @record
 */
API.Client.MoveChange = function() {}

/**
 * The percent value of how likely this move is to be successful.
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.accuracy;

/**
 * The base power before the listed version group, or null if power did not change.
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.power;

/**
 * Power points. The number of times this move can be used.
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.pp;

/**
 * The percent value of how likely it is this moves effect will take effect.
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.effectChance;

/**
 * The effect of this move listed in different languages.
 * @type {!Array<!API.Client.MoveEffectEffectText>}
 * @export
 */
API.Client.MoveChange.prototype.effectEntries;

/**
 * The elemental type of this move.
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.MoveChange.prototype.type;

/**
 * The version group in which these move stat values were in effect.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.MoveChange.prototype.versionGroup;

