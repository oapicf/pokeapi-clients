goog.provide('API.Client.GrowthRateDetail');

/**
 * @record
 */
API.Client.GrowthRateDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.GrowthRateDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.GrowthRateDetail.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.GrowthRateDetail.prototype.formula;

/**
 * @type {!Array<!API.Client.GrowthRateDescription>}
 * @export
 */
API.Client.GrowthRateDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.Experience>}
 * @export
 */
API.Client.GrowthRateDetail.prototype.levels;

/**
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.GrowthRateDetail.prototype.pokemonSpecies;

