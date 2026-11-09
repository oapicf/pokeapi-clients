goog.provide('API.Client.VersionGroupDetail');

/**
 * @record
 */
API.Client.VersionGroupDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.VersionGroupDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.VersionGroupDetail.prototype.name;

/**
 * Order for sorting. Almost by date of release, except similar versions are grouped together.
 * @type {!number}
 * @export
 */
API.Client.VersionGroupDetail.prototype.order;

/**
 * The generation this version was introduced in.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.VersionGroupDetail.prototype.generation;

/**
 * A list of methods in which Pokémon can learn moves in this version group.
 * @type {!Array<!API.Client.MoveLearnMethodSummary>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.moveLearnMethods;

/**
 * A list of Pokédexes introduces in this version group.
 * @type {!Array<!API.Client.PokedexSummary>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.pokedexes;

/**
 * A list of regions that can be visited in this version group.
 * @type {!Array<!API.Client.RegionSummary>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.regions;

/**
 * The versions this version group owns.
 * @type {!Array<!API.Client.VersionSummary>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.versions;

