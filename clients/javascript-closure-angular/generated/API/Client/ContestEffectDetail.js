goog.provide('API.Client.ContestEffectDetail');

/**
 * @record
 */
API.Client.ContestEffectDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ContestEffectDetail.prototype.id;

/**
 * The base number of hearts the user of this move gets.
 * @type {!number}
 * @export
 */
API.Client.ContestEffectDetail.prototype.appeal;

/**
 * The base number of hearts the user's opponent loses.
 * @type {!number}
 * @export
 */
API.Client.ContestEffectDetail.prototype.jam;

/**
 * The result of this contest effect listed in different languages.
 * @type {!Array<!API.Client.ContestEffectEffectText>}
 * @export
 */
API.Client.ContestEffectDetail.prototype.effectEntries;

/**
 * The flavor text of this contest effect listed in different languages.
 * @type {!Array<!API.Client.ContestEffectFlavorText>}
 * @export
 */
API.Client.ContestEffectDetail.prototype.flavorTextEntries;

