goog.provide('API.Client.PokemonSprites');

/**
 * @record
 */
API.Client.PokemonSprites = function() {}

/**
 * The default depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.frontDefault;

/**
 * The shiny depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.frontShiny;

/**
 * The female depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.frontFemale;

/**
 * The shiny female depiction of this Pokémon from the front in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.frontShinyFemale;

/**
 * The default depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.backDefault;

/**
 * The shiny depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.backShiny;

/**
 * The female depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.backFemale;

/**
 * The shiny female depiction of this Pokémon from the back in battle.
 * @type {!string}
 * @export
 */
API.Client.PokemonSprites.prototype.backShinyFemale;

/**
 * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
 * @type {!API.Client.PokemonSpritesOther}
 * @export
 */
API.Client.PokemonSprites.prototype.other;

/**
 * Sprites grouped by generation and game. Available keys vary by resource.
 * @type {!Object<!string, Object<!string, API.Client.AnyType>>}
 * @export
 */
API.Client.PokemonSprites.prototype.versions;

