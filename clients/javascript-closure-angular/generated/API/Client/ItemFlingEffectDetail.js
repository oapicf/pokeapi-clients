goog.provide('API.Client.ItemFlingEffectDetail');

/**
 * @record
 */
API.Client.ItemFlingEffectDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.name;

/**
 * @type {!Array<!API.Client.ItemFlingEffectEffectText>}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.effectEntries;

/**
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.ItemFlingEffectDetail.prototype.items;

