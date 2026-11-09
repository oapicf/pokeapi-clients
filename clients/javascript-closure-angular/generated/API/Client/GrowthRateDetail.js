goog.provide('API.Client.GrowthRateDetail');

/**
 * @record
 */
API.Client.GrowthRateDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.GrowthRateDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.GrowthRateDetail.prototype.name;

/**
 * The formula used to calculate the rate at which the Pokémon species gains level.
 * @type {!string}
 * @export
 */
API.Client.GrowthRateDetail.prototype.formula;

/**
 * The descriptions of this characteristic listed in different languages.
 * @type {!Array<!API.Client.GrowthRateDescription>}
 * @export
 */
API.Client.GrowthRateDetail.prototype.descriptions;

/**
 * A list of levels and the amount of experienced needed to atain them based on this growth rate.
 * @type {!Array<!API.Client.Experience>}
 * @export
 */
API.Client.GrowthRateDetail.prototype.levels;

/**
 * A list of Pokémon species that gain levels at this growth rate.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.GrowthRateDetail.prototype.pokemonSpecies;

