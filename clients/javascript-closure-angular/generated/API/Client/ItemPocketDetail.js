goog.provide('API.Client.ItemPocketDetail');

/**
 * @record
 */
API.Client.ItemPocketDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ItemPocketDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.ItemPocketDetail.prototype.name;

/**
 * A list of item categories that are relevant to this item pocket.
 * @type {!Array<!API.Client.ItemCategorySummary>}
 * @export
 */
API.Client.ItemPocketDetail.prototype.categories;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.ItemPocketName>}
 * @export
 */
API.Client.ItemPocketDetail.prototype.names;

