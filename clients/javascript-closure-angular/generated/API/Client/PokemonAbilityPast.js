goog.provide('API.Client.PokemonAbilityPast');

/**
 * @record
 */
API.Client.PokemonAbilityPast = function() {}

/**
 * Whether or not this is a hidden ability.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonAbilityPast.prototype.isHidden;

/**
 * The slot this ability occupies in this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonAbilityPast.prototype.slot;

/**
 * The ability the Pokémon may have.
 * @type {!API.Client.AbilitySummary}
 * @export
 */
API.Client.PokemonAbilityPast.prototype.ability;

