goog.provide('API.Client.NatureDetail');

/**
 * @record
 */
API.Client.NatureDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.NatureDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.NatureDetail.prototype.name;

/**
 * The stat decreased by 10% in Pokémon with this nature.
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.NatureDetail.prototype.decreasedStat;

/**
 * The stat increased by 10% in Pokémon with this nature.
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.NatureDetail.prototype.increasedStat;

/**
 * The flavor liked by Pokémon with this nature.
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.NatureDetail.prototype.likesFlavor;

/**
 * The flavor hated by Pokémon with this nature.
 * @type {!API.Client.BerryFlavorSummary}
 * @export
 */
API.Client.NatureDetail.prototype.hatesFlavor;

/**
 * A list of Pokéathlon stats this nature effects and how much it effects them.
 * @type {!Array<!API.Client.NaturePokeathlonStat>}
 * @export
 */
API.Client.NatureDetail.prototype.pokeathlonStatChanges;

/**
 * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
 * @type {!Array<!API.Client.NatureBattleStylePreference>}
 * @export
 */
API.Client.NatureDetail.prototype.moveBattleStylePreferences;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.NatureName>}
 * @export
 */
API.Client.NatureDetail.prototype.names;

