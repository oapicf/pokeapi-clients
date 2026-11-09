goog.provide('API.Client.RegionDetail');

/**
 * @record
 */
API.Client.RegionDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.RegionDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.RegionDetail.prototype.name;

/**
 * A list of locations that can be found in this region.
 * @type {!Array<!API.Client.LocationSummary>}
 * @export
 */
API.Client.RegionDetail.prototype.locations;

/**
 * The generation this region was introduced in.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.RegionDetail.prototype.mainGeneration;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.RegionName>}
 * @export
 */
API.Client.RegionDetail.prototype.names;

/**
 * A list of pokédexes that catalogue Pokémon in this region.
 * @type {!Array<!API.Client.PokedexSummary>}
 * @export
 */
API.Client.RegionDetail.prototype.pokedexes;

/**
 * A list of version groups where this region can be visited.
 * @type {!Array<!API.Client.VersionGroupSummary>}
 * @export
 */
API.Client.RegionDetail.prototype.versionGroups;

