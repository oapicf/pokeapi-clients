goog.provide('API.Client.MoveMeta');

/**
 * @record
 */
API.Client.MoveMeta = function() {}

/**
 * @type {!API.Client.MoveMetaAilmentSummary}
 * @export
 */
API.Client.MoveMeta.prototype.ailment;

/**
 * @type {!API.Client.MoveMetaCategorySummary}
 * @export
 */
API.Client.MoveMeta.prototype.category;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.minHits;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.maxHits;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.minTurns;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.maxTurns;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.drain;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.healing;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.critRate;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.ailmentChance;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.flinchChance;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.statChance;

