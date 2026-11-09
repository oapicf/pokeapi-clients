goog.provide('API.Client.SuperContestEffectDetail');

/**
 * @record
 */
API.Client.SuperContestEffectDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.id;

/**
 * The level of appeal this super contest effect has.
 * @type {!number}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.appeal;

/**
 * The flavor text of this super contest effect listed in different languages.
 * @type {!Array<!API.Client.SuperContestEffectFlavorText>}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.flavorTextEntries;

/**
 * A list of moves that have the effect when used in super contests.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.SuperContestEffectDetail.prototype.moves;

