goog.provide('API.Client.ItemPrice');

/**
 * @record
 */
API.Client.ItemPrice = function() {}

/**
 * The purchase price in this currency and version group, or null if unavailable.
 * @type {!number}
 * @export
 */
API.Client.ItemPrice.prototype.purchasePrice;

/**
 * The sell price in this currency and version group, or null if unavailable.
 * @type {!number}
 * @export
 */
API.Client.ItemPrice.prototype.sellPrice;

/**
 * The currency used for this price.
 * @type {!API.Client.CurrencySummary}
 * @export
 */
API.Client.ItemPrice.prototype.currency;

/**
 * The version group to which this price applies.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.ItemPrice.prototype.versionGroup;

