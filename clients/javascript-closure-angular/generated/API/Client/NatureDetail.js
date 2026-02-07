goog.provide('API.Client.NatureDetail');

/**
 * @record
 */
API.Client.NatureDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.NatureDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.NatureDetail.prototype.name;

/**
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.NatureDetail.prototype.decreasedStat;

/**
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.NatureDetail.prototype.increasedStat;

/**
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.NatureDetail.prototype.likesFlavor;

/**
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.NatureDetail.prototype.hatesFlavor;

/**
 * @type {!Array<!API.Client.BerrySummary>}
 * @export
 */
API.Client.NatureDetail.prototype.berries;

/**
 * @type {!Array<!API.Client.NatureDetail_pokeathlon_stat_changes_inner>}
 * @export
 */
API.Client.NatureDetail.prototype.pokeathlonStatChanges;

/**
 * @type {!Array<!API.Client.NatureBattleStylePreference>}
 * @export
 */
API.Client.NatureDetail.prototype.moveBattleStylePreferences;

/**
 * @type {!Array<!API.Client.NatureName>}
 * @export
 */
API.Client.NatureDetail.prototype.names;

