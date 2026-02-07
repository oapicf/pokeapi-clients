goog.provide('API.Client.PokedexDetail');

/**
 * @record
 */
API.Client.PokedexDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokedexDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokedexDetail.prototype.name;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokedexDetail.prototype.isMainSeries;

/**
 * @type {!Array<!API.Client.PokedexDescription>}
 * @export
 */
API.Client.PokedexDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.PokedexName>}
 * @export
 */
API.Client.PokedexDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokedexDetail_pokemon_entries_inner>}
 * @export
 */
API.Client.PokedexDetail.prototype.pokemonEntries;

/**
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.PokedexDetail.prototype.region;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.PokedexDetail.prototype.versionGroups;

