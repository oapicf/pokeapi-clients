goog.provide('API.Client.BerryFlavorDetail');

/**
 * @record
 */
API.Client.BerryFlavorDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.name;

/**
 * A list of the berries with this flavor.
 * @type {!Array<!API.Client.BerryFlavorBerryMap>}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.berries;

/**
 * The contest type that correlates with this berry flavor.
 * @type {!API.Client.ContestTypeSummary}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.contestType;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.BerryFlavorName>}
 * @export
 */
API.Client.BerryFlavorDetail.prototype.names;

