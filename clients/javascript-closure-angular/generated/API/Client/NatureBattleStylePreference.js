goog.provide('API.Client.NatureBattleStylePreference');

/**
 * @record
 */
API.Client.NatureBattleStylePreference = function() {}

/**
 * Chance of using the move, in percent, if HP is under one half.
 * @type {!number}
 * @export
 */
API.Client.NatureBattleStylePreference.prototype.lowHpPreference;

/**
 * Chance of using the move, in percent, if HP is over one half.
 * @type {!number}
 * @export
 */
API.Client.NatureBattleStylePreference.prototype.highHpPreference;

/**
 * The move battle style.
 * @type {!API.Client.MoveBattleStyleSummary}
 * @export
 */
API.Client.NatureBattleStylePreference.prototype.moveBattleStyle;

