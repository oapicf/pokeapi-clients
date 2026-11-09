goog.provide('API.Client.PokemonEncounterDetailResponse');

/**
 * @record
 */
API.Client.PokemonEncounterDetailResponse = function() {}

/**
 * Percent chance that this encounter will occur.
 * @type {!number}
 * @export
 */
API.Client.PokemonEncounterDetailResponse.prototype.chance;

/**
 * A list of condition values that must be in effect for this encounter to occur.
 * @type {!Array<!API.Client.EncounterConditionValueSummary>}
 * @export
 */
API.Client.PokemonEncounterDetailResponse.prototype.conditionValues;

/**
 * The highest level the Pokémon could be encountered at.
 * @type {!number}
 * @export
 */
API.Client.PokemonEncounterDetailResponse.prototype.maxLevel;

/**
 * The method by which this encounter happens.
 * @type {!API.Client.EncounterMethodSummary}
 * @export
 */
API.Client.PokemonEncounterDetailResponse.prototype.method;

/**
 * The lowest level the Pokémon could be encountered at.
 * @type {!number}
 * @export
 */
API.Client.PokemonEncounterDetailResponse.prototype.minLevel;

