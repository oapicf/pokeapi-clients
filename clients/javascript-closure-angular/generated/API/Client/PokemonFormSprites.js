goog.provide('API.Client.PokemonFormSprites');

/**
 * @record
 */
API.Client.PokemonFormSprites = function() {}

/**
 * The default depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.frontDefault;

/**
 * The shiny depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.frontShiny;

/**
 * The female depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.frontFemale;

/**
 * The shiny female depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.frontShinyFemale;

/**
 * The default depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.backDefault;

/**
 * The shiny depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.backShiny;

/**
 * The female depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.backFemale;

/**
 * The shiny female depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormSprites.prototype.backShinyFemale;

/**
 * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
 * @type {!API.Client.PokemonSpritesOther}
 * @export
 */
API.Client.PokemonFormSprites.prototype.other;

/**
 * Sprites grouped by generation and game. Available keys vary by resource.
 * @type {!Object<!string, Object<!string, API.Client.AnyType>>}
 * @export
 */
API.Client.PokemonFormSprites.prototype.versions;

