goog.provide('API.Client.EggGroupDetail');

/**
 * @record
 */
API.Client.EggGroupDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.EggGroupDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.EggGroupDetail.prototype.name;

/**
 * @type {!Array<!API.Client.EggGroupName>}
 * @export
 */
API.Client.EggGroupDetail.prototype.names;

/**
 * @type {!Array<!API.Client.EggGroupDetail_pokemon_species_inner>}
 * @export
 */
API.Client.EggGroupDetail.prototype.pokemonSpecies;

