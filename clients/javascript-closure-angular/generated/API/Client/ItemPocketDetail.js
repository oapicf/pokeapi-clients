goog.provide('API.Client.ItemPocketDetail');

/**
 * @record
 */
API.Client.ItemPocketDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ItemPocketDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemPocketDetail.prototype.name;

/**
 * @type {!Array<!API.Client.ItemCategorySummary>}
 * @export
 */
API.Client.ItemPocketDetail.prototype.categories;

/**
 * @type {!Array<!API.Client.ItemPocketName>}
 * @export
 */
API.Client.ItemPocketDetail.prototype.names;

