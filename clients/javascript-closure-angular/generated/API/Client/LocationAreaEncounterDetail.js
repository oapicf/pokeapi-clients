goog.provide('API.Client.LocationAreaEncounterDetail');

/**
 * @record
 */
API.Client.LocationAreaEncounterDetail = function() {}

/**
 * The lowest level the Pokémon could be encountered at.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaEncounterDetail.prototype.minLevel;

/**
 * The highest level the Pokémon could be encountered at.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaEncounterDetail.prototype.maxLevel;

/**
 * Percent chance that this encounter will occur.
 * @type {!number}
 * @export
 */
API.Client.LocationAreaEncounterDetail.prototype.chance;

/**
 * The method by which this encounter happens.
 * @type {!API.Client.EncounterMethodSummary}
 * @export
 */
API.Client.LocationAreaEncounterDetail.prototype.method;

/**
 * A list of condition values that must be in effect for this encounter to occur.
 * @type {!Array<!API.Client.EncounterConditionValueSummary>}
 * @export
 */
API.Client.LocationAreaEncounterDetail.prototype.conditionValues;

/**
 * Additional properties of the encountered Pokémon, or null if unspecified.
 * @type {!API.Client.EncounterPokemonDetail}
 * @export
 */
API.Client.LocationAreaEncounterDetail.prototype.pokemonDetails;

