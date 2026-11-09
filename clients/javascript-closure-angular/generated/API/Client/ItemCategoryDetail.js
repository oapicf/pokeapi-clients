goog.provide('API.Client.ItemCategoryDetail');

/**
 * @record
 */
API.Client.ItemCategoryDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.name;

/**
 * A list of items that are a part of this category.
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.items;

/**
 * The name of this item category listed in different languages.
 * @type {!Array<!API.Client.ItemCategoryName>}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.names;

/**
 * The pocket items in this category would be put in.
 * @type {!API.Client.ItemPocketSummary}
 * @export
 */
API.Client.ItemCategoryDetail.prototype.pocket;

