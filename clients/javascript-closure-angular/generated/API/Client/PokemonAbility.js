goog.provide('API.Client.PokemonAbility');

/**
 * @record
 */
API.Client.PokemonAbility = function() {}

/**
 * Whether or not this is a hidden ability.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonAbility.prototype.isHidden;

/**
 * The slot this ability occupies in this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonAbility.prototype.slot;

/**
 * The ability the Pokémon may have.
 * @type {!API.Client.AbilitySummary}
 * @export
 */
API.Client.PokemonAbility.prototype.ability;

