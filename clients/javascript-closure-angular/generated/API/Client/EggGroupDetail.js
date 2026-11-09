goog.provide('API.Client.EggGroupDetail');

/**
 * @record
 */
API.Client.EggGroupDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EggGroupDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.EggGroupDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.EggGroupName>}
 * @export
 */
API.Client.EggGroupDetail.prototype.names;

/**
 * A list of all Pokémon species that are members of this egg group.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.EggGroupDetail.prototype.pokemonSpecies;

