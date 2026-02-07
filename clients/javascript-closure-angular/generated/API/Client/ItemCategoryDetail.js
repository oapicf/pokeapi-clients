goog.provide('API.Client.ItemCategoryDetail');

/**
 * @record
 */
API.Client.ItemCategoryDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.name;

/**
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.items;

/**
 * @type {!Array<!API.Client.ItemCategoryName>}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.names;

/**
 * @type {!API.Client.ItemPocketSummary}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.pocket;

