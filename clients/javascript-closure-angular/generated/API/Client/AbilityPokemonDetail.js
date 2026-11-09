goog.provide('API.Client.AbilityPokemonDetail');

/**
 * @record
 */
API.Client.AbilityPokemonDetail = function() {}

/**
 * Whether or not this a hidden ability for the referenced Pokémon.
 * @type {!boolean}
 * @export
 */
API.Client.AbilityPokemonDetail.prototype.isHidden;

/**
 * Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
 * @type {!number}
 * @export
 */
API.Client.AbilityPokemonDetail.prototype.slot;

/**
 * The Pokémon this ability could belong to.
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.AbilityPokemonDetail.prototype.pokemon;

