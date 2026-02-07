goog.provide('API.Client.GenerationDetail');

/**
 * @record
 */
API.Client.GenerationDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.GenerationDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.GenerationDetail.prototype.name;

/**
 * @type {!Array<!API.Client.AbilitySummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.abilities;

/**
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.GenerationDetail.prototype.mainRegion;

/**
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.moves;

/**
 * @type {!Array<!API.Client.GenerationName>}
 * @export
 */
API.Client.GenerationDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.pokemonSpecies;

/**
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.types;

/**
 * @type {!Array<!API.Client.VersionGroupSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.versionGroups;

