goog.provide('API.Client.BerryDetail');

/**
 * @record
 */
API.Client.BerryDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.BerryDetail.prototype.name;

/**
 * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.growthTime;

/**
 * The maximum number of these berries that can grow on one tree in Generation IV.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.maxHarvest;

/**
 * The power of the move \"Natural Gift\" when used with this Berry.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.naturalGiftPower;

/**
 * The size of this Berry, in millimeters.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.size;

/**
 * The smoothness of this Berry, used in making Pokéblocks or Poffins.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.smoothness;

/**
 * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
 * @type {!number}
 * @export
 */
API.Client.BerryDetail.prototype.soilDryness;

/**
 * The firmness of this berry, used in making Pokéblocks or Poffins.
 * @type {!API.Client.BerryFirmnessSummary}
 * @export
 */
API.Client.BerryDetail.prototype.firmness;

/**
 * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
 * @type {!Array<!API.Client.BerryFlavorMap>}
 * @export
 */
API.Client.BerryDetail.prototype.flavors;

/**
 * Berries are actually items. This is a reference to the item specific data for this berry.
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.BerryDetail.prototype.item;

/**
 * The type inherited by \"Natural Gift\" when used with this Berry.
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.BerryDetail.prototype.naturalGiftType;

