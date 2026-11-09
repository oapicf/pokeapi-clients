goog.provide('API.Client.PalParkEncounter');

/**
 * @record
 */
API.Client.PalParkEncounter = function() {}

/**
 * The base score given to the player when this Pokémon is caught during a pal park run.
 * @type {!number}
 * @export
 */
API.Client.PalParkEncounter.prototype.baseScore;

/**
 * The base rate for encountering this Pokémon in this pal park area.
 * @type {!number}
 * @export
 */
API.Client.PalParkEncounter.prototype.rate;

/**
 * The Pokémon species being encountered.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PalParkEncounter.prototype.pokemonSpecies;

