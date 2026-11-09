goog.provide('API.Client.ItemAttributeDetail');

/**
 * @record
 */
API.Client.ItemAttributeDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.name;

/**
 * The description of this item attribute listed in different languages.
 * @type {!Array<!API.Client.ItemAttributeDescription>}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.descriptions;

/**
 * A list of items that have this attribute.
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.items;

/**
 * The name of this item attribute listed in different languages.
 * @type {!Array<!API.Client.ItemAttributeName>}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.names;

