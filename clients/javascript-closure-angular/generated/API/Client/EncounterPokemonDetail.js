goog.provide('API.Client.EncounterPokemonDetail');

/**
 * @record
 */
API.Client.EncounterPokemonDetail = function() {}

/**
 * The minimum number of perfect IVs, or null if unspecified.
 * @type {!number}
 * @export
 */
API.Client.EncounterPokemonDetail.prototype.minPerfectIvs;

/**
 * Whether the encountered Pokémon is always shiny.
 * @type {!boolean}
 * @export
 */
API.Client.EncounterPokemonDetail.prototype.alwaysShiny;

/**
 * Whether the encountered Pokémon can never be shiny.
 * @type {!boolean}
 * @export
 */
API.Client.EncounterPokemonDetail.prototype.neverShiny;

/**
 * Whether the encountered Pokémon is an alpha Pokémon.
 * @type {!boolean}
 * @export
 */
API.Client.EncounterPokemonDetail.prototype.isAlpha;

