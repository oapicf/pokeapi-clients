goog.provide('API.Client.PokemonType');

/**
 * @record
 */
API.Client.PokemonType = function() {}

/**
 * The order the Pokémon's types are listed in.
 * @type {!number}
 * @export
 */
API.Client.PokemonType.prototype.slot;

/**
 * The type the referenced Pokémon has.
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.PokemonType.prototype.type;

