goog.provide('API.Client.VersionGroupDetail');

/**
 * @record
 */
API.Client.VersionGroupDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.VersionGroupDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.VersionGroupDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.VersionGroupDetail.prototype.order;

/**
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.VersionGroupDetail.prototype.generation;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.moveLearnMethods;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.pokedexes;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.regions;

/**
 * @type {!Array<!API.Client.VersionSummary>}
 * @export
 */
API.Client.VersionGroupDetail.prototype.versions;

