goog.provide('API.Client.PokemonFormType');

/**
 * @record
 */
API.Client.PokemonFormType = function() {}

/**
 * The order the Pokémon's types are listed in.
 * @type {!number}
 * @export
 */
API.Client.PokemonFormType.prototype.slot;

/**
 * The type the referenced Form has.
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.PokemonFormType.prototype.type;

