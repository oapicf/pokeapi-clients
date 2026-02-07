goog.provide('API.Client.MoveChange');

/**
 * @record
 */
API.Client.MoveChange = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.accuracy;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.power;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.pp;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveChange.prototype.effectChance;

/**
 * @type {!Array<!API.Client.MoveChange_effect_entries_inner>}
 * @export
 */
API.Client.MoveChange.prototype.effectEntries;

/**
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.MoveChange.prototype.type;

/**
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.MoveChange.prototype.versionGroup;

