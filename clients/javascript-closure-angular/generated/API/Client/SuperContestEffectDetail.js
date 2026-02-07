goog.provide('API.Client.SuperContestEffectDetail');

/**
 * @record
 */
API.Client.SuperContestEffectDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.id;

/**
 * @type {!number}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.appeal;

/**
 * @type {!Array<!API.Client.SuperContestEffectFlavorText>}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.flavorTextEntries;

/**
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.moves;

