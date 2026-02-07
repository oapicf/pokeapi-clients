goog.provide('API.Client.RegionDetail');

/**
 * @record
 */
API.Client.RegionDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.RegionDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.RegionDetail.prototype.name;

/**
 * @type {!Array<!API.Client.LocationSummary>}
 * @export
 */
API.Client.RegionDetail.prototype.locations;

/**
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.RegionDetail.prototype.mainGeneration;

/**
 * @type {!Array<!API.Client.RegionName>}
 * @export
 */
API.Client.RegionDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokedexSummary>}
 * @export
 */
API.Client.RegionDetail.prototype.pokedexes;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.RegionDetail.prototype.versionGroups;

