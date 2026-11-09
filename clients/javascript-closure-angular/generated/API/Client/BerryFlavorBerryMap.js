goog.provide('API.Client.BerryFlavorBerryMap');

/**
 * @record
 */
API.Client.BerryFlavorBerryMap = function() {}

/**
 * How powerful the referenced flavor is for this berry.
 * @type {!number}
 * @export
 */
API.Client.BerryFlavorBerryMap.prototype.potency;

/**
 * The berry with the referenced flavor.
 * @type {!API.Client.BerrySummary}
 * @export
 */
API.Client.BerryFlavorBerryMap.prototype.berry;

