goog.provide('API.Client.GenderDetail');

/**
 * @record
 */
API.Client.GenderDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.GenderDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.GenderDetail.prototype.name;

/**
 * @type {!Array<!API.Client.GenderDetail_pokemon_species_details_inner>}
 * @export
 */
API.Client.GenderDetail.prototype.pokemonSpeciesDetails;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.GenderDetail.prototype.requiredForEvolution;

