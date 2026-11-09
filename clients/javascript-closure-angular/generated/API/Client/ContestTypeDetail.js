goog.provide('API.Client.ContestTypeDetail');

/**
 * @record
 */
API.Client.ContestTypeDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ContestTypeDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.ContestTypeDetail.prototype.name;

/**
 * The berry flavor that correlates with this contest type.
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.ContestTypeDetail.prototype.berryFlavor;

/**
 * The name of this contest type listed in different languages.
 * @type {!Array<!API.Client.ContestTypeName>}
 * @export
 */
API.Client.ContestTypeDetail.prototype.names;

