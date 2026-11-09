goog.provide('API.Client.PokemonPastAbility');

/**
 * @record
 */
API.Client.PokemonPastAbility = function() {}

/**
 * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
 * @type {!Array<!API.Client.PokemonAbilityPast>}
 * @export
 */
API.Client.PokemonPastAbility.prototype.abilities;

/**
 * The last generation in which the referenced pokémon had the listed abilities.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.PokemonPastAbility.prototype.generation;

