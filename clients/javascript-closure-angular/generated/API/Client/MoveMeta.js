goog.provide('API.Client.MoveMeta');

/**
 * @record
 */
API.Client.MoveMeta = function() {}

/**
 * The status ailment this move inflicts on its target.
 * @type {!API.Client.MoveMetaAilmentSummary}
 * @export
 */
API.Client.MoveMeta.prototype.ailment;

/**
 * The category of move this move falls under, e.g. damage or ailment.
 * @type {!API.Client.MoveMetaCategorySummary}
 * @export
 */
API.Client.MoveMeta.prototype.category;

/**
 * The minimum number of times this move hits. Null if it always only hits once.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.minHits;

/**
 * The maximum number of times this move hits. Null if it always only hits once.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.maxHits;

/**
 * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.minTurns;

/**
 * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.maxTurns;

/**
 * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.drain;

/**
 * The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.healing;

/**
 * Critical hit rate bonus.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.critRate;

/**
 * The likelihood this attack will cause an ailment.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.ailmentChance;

/**
 * The likelihood this attack will cause the target Pokémon to flinch.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.flinchChance;

/**
 * The likelihood this attack will cause a stat change in the target Pokémon.
 * @type {!number}
 * @export
 */
API.Client.MoveMeta.prototype.statChance;

