goog.provide('API.Client.BerryFlavorMap');

/**
 * @record
 */
API.Client.BerryFlavorMap = function() {}

/**
 * How powerful the referenced flavor is for this berry.
 * @type {!number}
 * @export
 */
API.Client.BerryFlavorMap.prototype.potency;

/**
 * The referenced berry flavor.
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.BerryFlavorMap.prototype.flavor;

