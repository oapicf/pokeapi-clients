goog.provide('API.Client.ItemAttributeDetail');

/**
 * @record
 */
API.Client.ItemAttributeDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.name;

/**
 * @type {!Array<!API.Client.ItemAttributeDescription>}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.items;

/**
 * @type {!Array<!API.Client.ItemAttributeName>}
 * @export
 */
API.Client.ItemAttributeDetail.prototype.names;

