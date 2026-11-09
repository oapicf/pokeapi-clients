goog.provide('API.Client.PokemonSpeciesPalParkEncounter');

/**
 * @record
 */
API.Client.PokemonSpeciesPalParkEncounter = function() {}

/**
 * The base score given to the player when the referenced Pokémon is caught during a pal park run.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesPalParkEncounter.prototype.baseScore;

/**
 * The base rate for encountering the referenced Pokémon in this pal park area.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesPalParkEncounter.prototype.rate;

/**
 * The pal park area where this encounter happens.
 * @type {!API.Client.PalParkAreaSummary}
 * @export
 */
API.Client.PokemonSpeciesPalParkEncounter.prototype.area;

