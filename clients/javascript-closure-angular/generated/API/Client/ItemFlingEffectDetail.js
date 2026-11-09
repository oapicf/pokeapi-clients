goog.provide('API.Client.ItemFlingEffectDetail');

/**
 * @record
 */
API.Client.ItemFlingEffectDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.name;

/**
 * The result of this fling effect listed in different languages.
 * @type {!Array<!API.Client.ItemFlingEffectEffectText>}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.effectEntries;

/**
 * A list of items that have this fling effect.
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.items;

