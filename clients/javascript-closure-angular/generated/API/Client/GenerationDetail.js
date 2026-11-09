goog.provide('API.Client.GenerationDetail');

/**
 * @record
 */
API.Client.GenerationDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.GenerationDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.GenerationDetail.prototype.name;

/**
 * A list of abilities that were introduced in this generation.
 * @type {!Array<!API.Client.AbilitySummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.abilities;

/**
 * The main region travelled in this generation.
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.GenerationDetail.prototype.mainRegion;

/**
 * A list of moves that were introduced in this generation.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.moves;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.GenerationName>}
 * @export
 */
API.Client.GenerationDetail.prototype.names;

/**
 * A list of Pokémon species that were introduced in this generation.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.pokemonSpecies;

/**
 * A list of types that were introduced in this generation.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.types;

/**
 * A list of version groups that were introduced in this generation.
 * @type {!Array<!API.Client.VersionGroupSummary>}
 * @export
 */
API.Client.GenerationDetail.prototype.versionGroups;

