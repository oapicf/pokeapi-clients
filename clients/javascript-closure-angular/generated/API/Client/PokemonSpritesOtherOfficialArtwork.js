goog.provide('API.Client.PokemonSpritesOtherOfficialArtwork');

/**
 * @record
 */
API.Client.PokemonSpritesOtherOfficialArtwork = function() {}

/**
 * The URL of the default front official artwork, or null if unavailable.
 * @type {!string}
 * @export
 */
API.Client.PokemonSpritesOtherOfficialArtwork.prototype.frontDefault;

/**
 * The URL of the shiny front official artwork, or null if unavailable.
 * @type {!string}
 * @export
 */
API.Client.PokemonSpritesOtherOfficialArtwork.prototype.frontShiny;

/**
 * Additional official artwork grouped by version. Available keys vary by resource.
 * @type {!Object<!string, Object<!string, API.Client.AnyType>>}
 * @export
 */
API.Client.PokemonSpritesOtherOfficialArtwork.prototype.versions;

